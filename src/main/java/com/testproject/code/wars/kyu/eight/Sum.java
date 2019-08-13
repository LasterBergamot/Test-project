package com.testproject.code.wars.kyu.eight;

import java.util.Arrays;
import java.util.stream.Stream;

public class Sum {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }
}
