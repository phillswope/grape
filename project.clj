(defproject grape "0.1.0-SNAPSHOT"
  :description "Syntax-aware Grep-like for Clojure code"
  :url "https://github.com/bfontaine/grape"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [carocad/parcera "0.3.1"]
                 [com.rpl/specter "1.1.3"]]
  :profiles {:dev {:source-paths ["dev"]
                   :global-vars {*warn-on-reflection* true}
                   :dependencies [[org.clojure/tools.namespace  "0.2.11"]]}})
