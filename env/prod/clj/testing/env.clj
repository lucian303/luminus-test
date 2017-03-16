(ns testing.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[testing started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[testing has shut down successfully]=-"))
   :middleware identity})
