package com.testproject.code.exercises.moderate;

public class ModerateExercise {

    /**
     * Fizz Buzz
     * Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
     * For numbers which are multiples of both three and five return 'FizzBuzz'.
     * For numbers that are neither, return the input number.
     * @param i - The input number
     * @return Fizz if the input is multiple of 3, Buzz if multiple of 5, FizzBuzz if multiple of both, the input number itself if neither
     */
    public String fizzBuzz(Integer i) {
        String result = i.toString();

        if (i % 3 == 0 && i % 5 == 0) {
            result = "FizzBuzz";
        } else if (i % 3 == 0) {
            result = "Fizz";
        } else if (i % 5 == 0) {
            result = "Buzz";
        }

        return result;
    }
}
