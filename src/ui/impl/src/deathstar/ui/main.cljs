(ns deathstar.ui.main
  (:require
   [clojure.core.async :as a :refer [chan go go-loop <! >!  take! put! offer! poll! alt! alts! close!
                                     pub sub unsub mult tap untap mix admix unmix pipe
                                     timeout to-chan  sliding-buffer dropping-buffer
                                     pipeline pipeline-async]]
   [cljs.core.async.impl.protocols :refer [closed?]]
   [cljs.core.async.interop :refer-macros [<p!]]
   [goog.string.format :as format]
   [goog.string :refer [format]]
   [goog.object]
   [clojure.string :as string]
   [cljs.reader :refer [read-string]]

   [cljctools.csp.op.spec :as op.spec]
   [cljctools.cljc.core :as cljc.core]

   [cljctools.rsocket.spec :as rsocket.spec]
   [cljctools.rsocket.chan :as rsocket.chan]
   [cljctools.rsocket.impl :as rsocket.impl]
   [cljctools.rsocket.examples]

   [cljctools.browser-router.spec :as browser-router.spec]
   [cljctools.browser-router.chan :as browser-router.chan]
   [cljctools.browser-router.impl :as browser-router.impl]

   [deathstar.ui.spec :as ui.spec]
   [deathstar.ui.chan :as ui.chan]

   [deathstar.app.spec :as app.spec]
   [deathstar.app.chan :as app.chan]



   [deathstar.ui.render.impl :as render.impl]))

(goog-define RSOCKET_PORT 0)

(def channels (merge
               (rsocket.chan/create-channels)
               (browser-router.chan/create-channels)
               (ui.chan/create-channels)))

(pipe (::rsocket.chan/requests| channels) (::ui.chan/ops| channels))



(def state (render.impl/create-state
            {}))

(def routes ["/" {"" ::ui.spec/page-events
                  "game/" {[::app.spec/game-id ""] ::ui.spec/page-game}}])
(def router (browser-router.impl/create-proc-ops channels state {::browser-router.spec/routes routes}))



(defn create-proc-ops
  [channels opts]
  (let [{:keys [::ui.chan/ops|]} channels]
    (go
      (loop []
        (when-let [[value port] (alts! [ops|])]
          (condp = port
            ops|
            (condp = (select-keys value [::op.spec/op-key ::op.spec/op-type ::op.spec/op-orient])

              {::op.spec/op-key ::ui.chan/init}
              (let [{:keys []} value]
                (render.impl/render-ui channels state {})
                (println ::init))

              {::op.spec/op-key ::ui.chan/update-state
               ::op.spec/op-type ::op.spec/fire-and-forget}
              (let [{:keys []} value]
                (reset! state value)))))
        (recur)))))

(def rsocket (rsocket.impl/create-proc-ops
              channels
              {::rsocket.spec/connection-side ::rsocket.spec/initiating
               ::rsocket.spec/host "localhost"
               ::rsocket.spec/port RSOCKET_PORT
               ::rsocket.spec/transport ::rsocket.spec/websocket}))

(def ui (create-proc-ops channels {}))

(defn ^:export main
  []
  (println ::main)
  (println ::RSOCKET_PORT RSOCKET_PORT)
  (ui.chan/op
   {::op.spec/op-key ::ui.chan/init}
   channels
   {}))


(do (main))