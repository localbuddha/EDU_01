package edu05.HomeWork01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TenIntegersTest {
    int[] tenIntegers = new int[10];

    @Test
    void sumCalc() {
        assertEquals(4, TenIntegers.sumCalc(tenIntegers));
    }
}