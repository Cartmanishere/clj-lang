(ns clj-lang.core
  (:require [libpython-clj.require :refer [require-python]]
            [libpython-clj.python :refer [py. py.. py.-] :as py]
            [clojure.string :refer [split]]
            [tech.v2.datatype :as dtype])
  (:gen-class))



(py/run-simple-string "import sys")
(py/run-simple-string "sys.path.append('/Users/pranav/.virtualenvs/py3/lib/python3.7/site-packages')")

(require-python 'fasttext)

(defn init-model
  [model-path]
  (fasttext/load_model model-path))

(defonce model (atom (init-model "../lang-detect/models/lid.176.bin")))


(defn predict
  [text]
  (let [pred (py. @model predict text)]
    (-> pred
        ffirst
        (split #"__")
        last)))
