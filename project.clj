(defproject discerno "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]                 
                 [marginalia "0.9.0"]]
  :main ^:skip-aot discerno.core
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[expectations "2.2.0-beta1"]]}
             :uberjar {:aot :all}})
