(defproject compliment "0.3.7-SNAPSHOT"
  :description "The Clojure completion library you deserve"
  :url "https://github.com/alexander-yakushev/compliment"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.9.0"]
                                  [criterium "0.4.4"]
                                  [cloverage "1.0.13"]
                                  [fudje "0.9.7"]]
                   :plugins [[jonase/eastwood "0.3.1"]
                             [lein-shell "0.5.0"]]
                   :eastwood {:namespaces [:source-paths]}

                   :aliases {"test" ["do" ["check"] ["test"]]
                             ;; "test-all" ["do" ["check"] ["midje" ":filters" "-fullbench"]]
                             "bench" ["run" "-m" "compliment.t-benchmark" "true"]
                             "fullbench" ["run" "-m" "compliment.t-benchmark"]
                             "coverage" ["do" ["run" "-m" "compliment.t-coverage" "--coveralls"]
                                         ["shell" "curl" "-F"
                                          "json_file=@target/coverage/coveralls.json"
                                          "https://coveralls.io/api/v1/jobs"]]}}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}})
