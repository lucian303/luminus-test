(ns user
  (:require [mount.core :as mount]
            testing.core))

(defn start []
  (mount/start-without #'testing.core/http-server
                       #'testing.core/repl-server))

(defn stop []
  (mount/stop-except #'testing.core/http-server
                     #'testing.core/repl-server))

(defn restart []
  (stop)
  (start))


