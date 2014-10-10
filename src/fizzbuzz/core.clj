(ns fizzbuzz.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn divisable-by-three? [number] 
  (= 0 (mod number 3)))

(defn divisable-by-five? [number]
  (= 0 (mod number 5)))

(defn divisable-by-fifteen? [number]
  (= 0 (mod number 15)))

(defn divisable-by? [number divisor]
  (= 0 (mod number divisor)))

(defn fizz-buzz [number]
  (if (divisable-by? number 3) "fizz"))