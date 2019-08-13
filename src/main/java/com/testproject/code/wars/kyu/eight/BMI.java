package com.testproject.code.wars.kyu.eight;

public class BMI {
    public static String bmi(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        String result = "";

        if (bmi <= 18.5d) {
            result = "Underweight";
        } else if (bmi <= 25d) {
            result = "Normal";
        } else if (bmi <= 30d) {
            result = "Overweight";
        } else if (bmi > 30d) {
            result = "Obese";
        }

        return result;
    }
}
