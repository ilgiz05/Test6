package com.example.test6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    Math math;

    @Before
    public void init() {
        math = new Math();
    }

    @Test
    public void addTest() {
        assertEquals("17", math.add("12", "5"));
    }

    @Test
    public void simpleDivideTest() {
        assertEquals("1", math.divide("2", "2"));
    }

    @Test

    public void simpleMultiplyTest() {
        assertEquals("49", math.multiply("7", "7"));
    }

    @Test
    public void simpleSubtractionTest() {
        assertEquals("999", math.subtract("1000", "1"));
    }

    @Test
    public void addIncludingSpacesTestCase() {
        assertEquals("17", math.add("      12", "5"));
    }

    @Test
    public void addIncludingMinusTestCase() {
        assertEquals("Error, negative number occurred", math.add("-5", "3"));

    }

    @Test
    public void isDividedByZero() {
        assertEquals("Error,you can't divide by zero", math.dividedByZero("2", "0"));
    }

    @Test
    public void doesIncludeSpecialCharacters() {
        assertEquals("Error,special characters have been detected", math.areSymbolsIncluded("!@#@0!#@!2", "456"));
    }

    @After
    public void detach() {
        math = null;
    }
}
