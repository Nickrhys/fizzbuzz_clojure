(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest is-divisable-by-three
  (testing "returns true for 3"
    (is (= true (divisable-by-three? 3)))))

(deftest is-not-divisable-by-three
  (testing "returns false for 1"
    (is (= false (divisable-by-three? 1)))))

(deftest is-divisable-by-five
  (testing "returns true for 5"
    (is (= true (divisable-by-five? 5)))))

(deftest is-not-divisable-by-five
  (testing "returns false for 1"
    (is (= false (divisable-by-five? 1)))))

(deftest is-divisable-by-fifteen
  (testing "returns true for 15"
    (is (= true (divisable-by-fifteen? 15)))))

(deftest is-not-divisable-by-fifteen
  (testing "returns false for 1"
    (is (= false (divisable-by-fifteen? 1)))))

(deftest returns-fizz-for-six
  (testing "returns fizz when divisable by three"
    (is (= "fizz" ( fizz-buzz 6)))))

(deftest returns-buzz-for-ten
  (testing "returns buzz when divisable by five"
    (is (= "buzz" (fizz-buzz 10)))))

(deftest returns-fizz-buzz-for-thirty
  (testing "returns fizzbuzz when divisable by fifteen"
    (is (= "fizzbuzz" (fizz-buzz 30)))))