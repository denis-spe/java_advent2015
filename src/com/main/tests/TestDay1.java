/*
    Praise the LORD GOD of host.
 */
package com.main.tests;

import org.junit.Test;
import static com.main.advent2015.day1.Day1.part1;
import static com.main.advent2015.day1.Day1.part2;
import static org.junit.Assert.assertEquals;

/**
 * Testing day one.
 */
public class TestDay1 implements TestDay {

    /**
     * Test part one from a day.
     */
    @Test
    @Override
    public void testPart1() {
        assertEquals(
                0,
                part1(null, "(())")
        );
        assertEquals(
                0,
                part1(null, "()()")
        );
        assertEquals(
                3,
                part1(null, "(()(()(")
        );
        assertEquals(
                3,
                part1(null, "(((")
        );
        assertEquals(
                -1,
                part1(null, "())")
        );
        assertEquals(
                -1,
                part1(null, "))(")
        );
        assertEquals(
                -3,
                part1(null, ")))")
        );
        assertEquals(
                -3,
                part1(null, ")())())")
        );
        assertEquals(
                232,
                part1("day1", null)
        );
    }

    /**
     * Test part two from a day.
     */
    @Test
    @Override
    public void testPart2() {
        assertEquals(
                1,
                part2(null, ")")
        );

        assertEquals(
                5,
                part2(null, "()())")
        );

        assertEquals(
                1783,
                part2("day1", null)
        );
    }
}
