(ns fizzbuzz.core)

(defn fizzbuzz [match-numbers n]
  (cond (some #(and (>= n (first %)) (= (mod n (first %)) 0)) match-numbers)
        (apply str (map #(if (and (>= n (first %)) (= (mod n (first %)) 0))
                           (second %))
                        match-numbers))
        :else n))

;; example usage

(comment
  (map println (map (partial fizzbuzz [[3 "fizz"] [5 "buzz"] [7 "blah"] [13 "blubb"]]) (range 100))))
