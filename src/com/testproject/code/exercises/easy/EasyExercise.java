package com.testproject.code.exercises.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EasyExercise {

    /**
     * Sum of Two Numbers
     * Write a method that sums two numbers.
     * @param i - first number
     * @param j - second number
     * @return - the sum of the given two numbers
     */
    public Integer sum(Integer i, Integer j) {
        return i + j;
    }

    /**
     * Sum Multiples of Three and Five
     * Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
     * @param n - the uppper limit number
     * @return Sum
     */
    public Integer sum(Integer n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    /**
     * Factorial
     * Write a method that calculates the factorial of a given number.
     * Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
     * TIP: To make it more interesting, try to do it recursively.
     * @param n - the given number
     * @return The factorial of the given number
     */
    public Integer factorial(Integer n) {
        if (n == 1) return 1;

        return n * factorial(n - 1);
    }

    /**
     * Linear Search
     * Write a method that returns the index of the first occurrence of given integer in a list.
     * Assume that the index of the first element in the list is zero.
     * If the number does not exist return -1.
     * @param n The number to find
     * @param list The list to search in
     * @return The index of the element, or -1 if not found
     */
    public int search(Integer n, Integer[] list) {
        int index = -1;

        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(n)) {
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     * Reverse String
     * Write a method that reverses a string.
     * For example, 'java interview' becomes 'weivretni avaj'.
     * @param s - The String to reverse
     * @return The reversed String
     */
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    /**
     * Find Maximum
     * Write a method that returns the largest integer in the list.
     * You can assume that the list has at least one element.
     * @param list - An integer list
     * @return The largest integer
     */
    public Integer maximum(Integer[] list) {
        return Arrays.stream(list).max(Integer::compareTo).orElse(-1);
    }

    /**
     * Average Value (Java 8 Lambdas and Streams)
     * Write a method that returns the average of a list of integers.
     * @param list - An integer list
     * @return The average value of the elements found in the list
     */
    public Double average(List<Integer> list) {
        return list.stream()
                .mapToInt(integer -> integer)
                .average()
                .orElse(-1d);
    }

    /**
     * Convert to Upper Case (Java 8 Lambdas and Streams)
     * Write a method that converts all strings in a list to their upper case.
     * @param list A String list
     * @return The given list, but in upper case
     */
    public List<String> upperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    /**
     * Nth Odd Element
     * Write a method that returns th nth element of a list. If the index of the element exceeds the list size, then return -1.
     * @param list - An integer list
     * @param n - The index of the element to return
     * @return The nth element of the list, or -1 if n exceeds the list size
     */
    public Integer getElement(List<Integer> list, Integer n) {
        if (list.size() <= n) return  -1;

        return list.get(n);
    }
}
