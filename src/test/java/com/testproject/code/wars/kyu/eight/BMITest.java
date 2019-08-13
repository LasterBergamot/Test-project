package com.testproject.code.wars.kyu.eight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BMITest {
    @Test
    public void testBMI() {
        assertEquals("Normal", BMI.bmi(80, 1.80));
    }
}
