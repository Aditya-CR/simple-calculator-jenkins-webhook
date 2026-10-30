package com.simple_calculator_jenkins_webhook;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    public void testAdd() { 
        assertEquals(8, calc.add(5, 3)); 
    }

    @Test
    public void testSubtract() { 
        assertEquals(2, calc.subtract(5, 3)); 
    }
}
