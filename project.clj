(defproject discerno "discerno-0.1.0-SNAPSHOT"
  :description "Personal Learning Environment"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [environ "1.1.0"]
                 [marginalia "0.9.0"]]
  :main ^:skip-aot discerno.core
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[expectations "2.2.0-beta1"]]}
             :uberjar {:aot :all}})
