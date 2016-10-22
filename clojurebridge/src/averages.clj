(defn angles [] 
  [{:angle 30}
   {:angle 90} 
   {:angle 50}])

(defn angle-values [] 
  (flatten (map vals (angles))))

(defn totals [] 
  (reduce + (angle-values)))

(defn averages [] 
  (int
    (/ (totals) 
       (count (angle-values)))))


(defn averages2 [v]
  (int
    (/ (reduce + (flatten(map vals v)))
       (count v))))