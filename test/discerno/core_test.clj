(ns discerno.core-test
  (:use expectations)
  (:require [clojure.tools.logging :as log]))

;; Math check
(expect 2 (+ 1 1))
(log/info "logging works from a test file")
