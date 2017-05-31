(ns discerno.core
  (:gen-class)
  (:require [clojure.tools.logging :as log]))

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Salve Mundus!")
  (log/info "logging works!"))

(defn mult3
  [x]
  (* x 3))
