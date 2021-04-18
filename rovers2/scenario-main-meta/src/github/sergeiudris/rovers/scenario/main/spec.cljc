(ns github.sergeiudris.rovers.scenario.main.spec
  #?(:cljs (:require-macros [github.sergeiudris.rovers.scenario.main.spec]))
  (:require
   [clojure.spec.alpha :as s]
   [clojure.spec.gen.alpha :as sgen]
   [clojure.spec.test.alpha :as stest]
   [clojure.test.check.generators :as gen]
   [clojure.test.check.properties :as prop]))