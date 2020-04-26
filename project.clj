(defproject clj-lang "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.8.0"] ;; You need `1.10.1` here.
                 [clj-python/libpython-clj "1.39-SNAPSHOT"]] ;; This is custom code to run on `1.8`
  :main ^:skip-aot clj-lang.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
