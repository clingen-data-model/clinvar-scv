(defproject clinvar-scv "0.1.0-SNAPSHOT"
  :description "Pilot ClinVar SCV project to test feed to VCI"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [cheshire "5.10.0"]
                 [fundingcircle/jackdaw "0.7.4"]
                 [com.google.cloud/google-cloud-storage "1.101.0"]
                 [com.taoensso/timbre "4.10.0"]
                 [org.clojure/core.async "1.2.603"]]
  :main ^:skip-aot clinvar-scv.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :uberjar-name "clinvar-scv.jar"}})
