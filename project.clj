(defproject crucible "0.4.0"
  :description "AWS Cloudformation templates in Clojure"
  :url "http://github.com/brabster/crucible"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies[[camel-snake-kebab "0.3.2"]
                [org.clojure/clojure "1.8.0"]]
  :repositories [["snapshots" {:url "https://clojars.org/repo"
                              :username :env/clojars_username
                              :password :env/clojars_password}]
                ["releases" {:url "https://clojars.org/repo"
                            :username :env/clojars_username
                            :password :env/clojars_password
                            :sign-releases false}]]
  :main ^:skip-aot crucible.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
