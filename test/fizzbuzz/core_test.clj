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