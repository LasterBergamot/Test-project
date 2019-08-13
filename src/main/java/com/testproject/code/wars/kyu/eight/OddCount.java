package com.testproject.code.wars.kyu.eight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Given a number n, return the number of positive odd numbers below n, EASY!
 *
 * oddCount(7) //=> 3, i.e [1, 3, 5]
 * oddCount(15) //=> 7, i.e [1, 3, 5, 7, 9, 11, 13]
 *
 * Expect large Inputs!
 */
public class OddCount {
    public static int oddCount(int n) {
        // boxed(): box int to an Integer
        List<Integer> numbersBelowN = IntStream.range(0, n).boxed().collect(Collectors.toList());
        return (int) numbersBelowN.stream().filter(integer -> integer % 2 == 1).count();
    }
}
