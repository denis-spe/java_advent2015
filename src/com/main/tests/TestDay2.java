/*
    Great is the might GOD of Jacob.
 */
package com.main.tests;

import org.junit.Test;
import static com.main.advent2015.day2.Day2.part1;
import static com.main.advent2015.day2.Day2.part2;
import static org.junit.Assert.assertEquals;

/**
 * Testing day two.
 */
public class TestDay2 implements TestDay{

    /**
     * Test part one from a day.
     */
    @Test
    @Override
    public void testPart1() {
        assertEquals(58, part1(null, "2x3x4"));
        assertEquals(43, part1(null, "1x1x10"));
        assertEquals(1586300, part1("day2", null));
    }

    /**
     * Test part two from a day.
     */
    @Test
    @Override
    public void testPart2() {
        assertEquals(34, part2(null, "2x3x4"));
        assertEquals(14, part2(null, "1x1x10"));
        assertEquals(3737498, part2("day2", null));
    }
}
