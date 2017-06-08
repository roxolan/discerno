(defproject discerno "discerno-0.1.0-SNAPSHOT"
  :description "Personal Learning Environment"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.3.443"]
                 [org.clojure/core.match "0.3.0-alpha4"]
                 [org.clojure/core.memoize "0.5.9"]
                 [org.clojure/tools.logging "0.3.1"]
                 [environ "1.1.0"]
                 [honeysql "0.9.0-beta2"]
                 [log4j/log4j "1.2.17" 
                  :exclusions [javax.mail/mail
                               javax.jms/jms
                               com.sun.jdmk/jmxtools
                               com.sun.jmx/jmxri]]
                 [marginalia "0.9.0"]
                 [toucan "1.0.3"
                  :exclusions [honeysql]]]

  :plugins [[lein-expectations "0.0.8"]]

  :main ^:skip-aot discerno.core
  :target-path "target/%s"
  :profiles {:dev {:dependencies [[expectations "2.2.0-beta1"]]
                   :jvm-opts ["-Dlogfile.path=target/log"]}
             :uberjar {:aot :all}})
