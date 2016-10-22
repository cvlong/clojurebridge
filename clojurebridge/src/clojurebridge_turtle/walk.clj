(ns clojurebridge-turtle.walk
  (:use clojure.repl)
  (:use clojurebridge-turtle.core))
(init)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; On NightCode, click Run with REPL followed by Reload File
;; for the first time. If REPL has already started, click
;; Reload File to run this code.
;;
;; Once a turtle (small triangle) appears in the center of window,
;; type code in REPL.
;;
;; Alternatively, you may type code in this editor. To evaluate:
;; - pieces of code: select code fragment and Reload Selection
;; - whole file: click Reload File
;;
;; [Exercise]
;; write some functions under these comment lines
;; and evalute those
;;
;; for example
;; (forward 30)
;; (right 90)
;; (forward 30)
;; (right 90)
;;
;; see how the turtle walks
;;
(add-turtle :neo)
(add-turtle :oracle)

(defn forward-right
  "Move specified turtle forward and tilts its head"
  [turtle]
  (forward turtle 60)
  (right turtle 135))

(defn forward-right-with-len-ang
  "Moves specified turtle forward at angle"
  [turtle len ang]
  (forward turtle len)
  (right turtle ang))

(forward-right-with-len-ang :trinity 60 120)
(forward-right-with-len-ang :trinity 60 120)
(forward-right-with-len-ang :trinity 60 120)



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
    

    



