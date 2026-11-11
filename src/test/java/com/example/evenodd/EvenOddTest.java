
package com.example.evenodd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class EvenOddTest {

    @Test
    void testEvenNumber() {
        assertEquals("Even Number", EvenOdd.checkNumber(10));
    }

    @Test
    void testOddNumber() {
        assertEquals("Odd Number", EvenOdd.checkNumber(7));
    }

    @Test
    void testZero() {
        assertEquals("Even Number", EvenOdd.checkNumber(0));
    }

    @Test
    void testNegativeEven() {
        assertEquals("Even Number", EvenOdd.checkNumber(-4));
    }

    @Test
    void testNegativeOdd() {
        assertEquals("Odd Number", EvenOdd.checkNumber(-3));
    }
}
