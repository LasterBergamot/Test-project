package com.testproject;

import com.testproject.code.exercises.CodeExercise;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        CodeExercise codeExercise = new CodeExercise();
        System.out.println(codeExercise.getElement(List.of(3, 79), 2));
    }
}
