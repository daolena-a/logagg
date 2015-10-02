(ns logagg.routes.home
  (:require [logagg.layout :as layout]
            [compojure.core :refer [defroutes GET POST]]
            [ring.util.http-response :refer [ok]]
            [clojure.java.io :as io]))

(defn home-page []
  (layout/render "home.html"))

  (defn add-log []
    (println "addlog")
    (layout/render "home.html"))


(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/docs" [] (ok (-> "docs/docs.md" io/resource slurp)))
  (GET "/addlog" [] (add-log))
  (POST "/addlog" [] (add-log))
  )
