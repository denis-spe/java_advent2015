package com.main.tests;

import org.junit.Test;
import static com.main.advent2015.day1.Day1.part1;
import static com.main.advent2015.day1.Day1.part2;
import static org.junit.Assert.assertEquals;

public class TestDay1 {

    @Test
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

    @Test
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
