package com.demo;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(calc.add(2, 3), 6);
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(calc.subtract(5, 3), 2);
    }
}
