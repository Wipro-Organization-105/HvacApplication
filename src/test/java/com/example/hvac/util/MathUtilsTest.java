package com.example.hvac.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {

    @Test
    void testAddPositiveNumbers() {
        assertEquals(5, MathUtils.add(2, 3));
    }

    @Test
    void testAddWithZero() {
        assertEquals(7, MathUtils.add(7, 0));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, MathUtils.add(-2, -3));
    }
}
