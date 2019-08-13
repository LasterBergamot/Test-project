package com.testproject;

import com.testproject.code.exercises.easy.EasyExercise;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(new EasyExercise().getElement(List.of(3, 79), 2));
    }
}
