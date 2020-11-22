(ns github.sergeiudris.deathstar-lab.scenarios.rovers.scenario.main
  (:require
   [clojure.core.async :as a :refer [chan go go-loop <! >!  take! put! offer! poll! alt! alts! close!
                                     pub sub unsub mult tap untap mix admix unmix pipe
                                     timeout to-chan  sliding-buffer dropping-buffer
                                     pipeline pipeline-async]]
   [clojure.core.async.impl.protocols :refer [closed?]]
   #?(:cljs [cljs.core.async.interop :refer-macros [<p!]])
   #?(:cljs [goog.string.format :as format])
   #?(:cljs [goog.object])
   #?(:cljs [goog.string.format :as format])
   #?(:cljs [cljs.reader :refer [read-string]])

   [clojure.string :as string]
   [cljctools.csp.op.spec :as op.spec]
   [cljctools.cljc.core :as cljc.core]

  ;;  [cljctools.rsocket.spec :as rsocket.spec]
  ;;  [cljctools.rsocket.chan :as rsocket.chan]
  ;;  [cljctools.rsocket.impl :as rsocket.impl]

   [deathstar.scenario.chan :as scenario.chan]
   [deathstar.scenario.spec :as scenario.spec]

   [github.sergeiudris.deathstar-lab.scenarios.rovers.scenario.spec :as rovers.scenario.spec]
   [github.sergeiudris.deathstar-lab.scenarios.rovers.scenario.chan :as rovers.scenario.chan]
   [github.sergeiudris.deathstar-lab.scenarios.rovers.scenario.render :as rovers.scenario.render]))

(goog-define RSOCKET_PORT 0)

(def channels (merge
               (scenario.chan/create-channels)
               (rovers.chan/create-channels)
               (rsocket.chan/create-channels)))

(pipe (::rsocket.chan/requests| channels) (::rovers.chan/ops| channels))

(pipe (::scenario.chan/ops| channels) (::rsocket.chan/ops| channels))

(def state (rovers.render/create-state
            {}))

(comment
  
  (swap! state assoc :random (rand-int 10))
  
  ;;
  )

(defn create-proc-ops
  [channels opts]
  (let [{:keys [::rovers.chan/ops|]} channels]
    (go
      (loop []
        (when-let [[value port] (alts! [ops|])]
          (condp = port
            ops|
            (condp = (select-keys value [::op.spec/op-key ::op.spec/op-type ::op.spec/op-orient])

              {::op.spec/op-key ::rovers.chan/init}
              (let [{:keys []} value]
                (println ::init)
                (rovers.render/render-ui channels state {})))))
        (recur)))))

#_(def rsocket (rsocket.impl/create-proc-ops
                channels
                {::rsocket.spec/connection-side ::rsocket.spec/initiating
                 ::rsocket.spec/host "localhost"
                 ::rsocket.spec/port RSOCKET_PORT
                 ::rsocket.spec/transport ::rsocket.spec/websocket}))

(def rovers (create-proc-ops channels {}))

(defn ^:export main
  []
  (println ::main)
  (println ::RSOCKET_PORT RSOCKET_PORT)
  (rovers.chan/op
   {::op.spec/op-key ::rovers.chan/init}
   channels
   {}))


(do (main))