/*
 Bless be the name of LORD GOD of host.
 */
package com.main.advent2015.day2;

import com.main.ExtractContents;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * --- Day 2: I Was Told There Would Be No Math ---
 */
public class Day2 {

    /**
     * Extract the contents from the file.
     * @param day A day of advent.
     * @param contents A simple input for testing.
     * @return A list of string.
     */
    public static Stream<String> contents(@Nullable String day, @Nullable String contents) {
        // Initialize the ExtractContents object.
        ExtractContents extractContents = new ExtractContents(day, contents, "\n");
        // Split the string by new line.
        return Arrays.stream(extractContents.content.split("\n"));
    }

    /**
     * --- Part One ---
     * <p>
     * The elves are running low on wrapping paper, and so they need to submit an order for more.
     * They have a list of the dimensions (length l, width w, and height h) of each present,
     * and only want to order exactly as much as they need.
     * <p>
     * Fortunately, every present is a box (a perfect right rectangular prism), which makes calculating the
     * required wrapping paper for each gift a little easier: find the surface area of the box,
     * which is 2*l*w + 2*w*h + 2*h*l. The elves also need a little extra paper for each present:
     * the area of the smallest side.
     * <p>
     * For example:
     * <p>
     * - A present with dimensions 2x3x4 requires 2*6 + 2*12 + 2*8 = 52 square
     *   feet of wrapping paper plus 6 square feet of slack, for a total of 58 square feet. <br>
     * - A present with dimensions 1x1x10 requires 2*1 + 2*10 + 2*10 = 42 square
     *   feet of wrapping paper plus 1 square foot of slack, for a total of 43 square feet. <br>
     * All numbers in the elves' list are in feet. How many total square feet of wrapping paper should they order?
     *
     * @param day A text input for puzzle submission.
     * @param contents For testing
     * @return Total square feet of wrapping paper
     */
    public static int part1(@Nullable String day, @Nullable String contents){
        Stream<String> contentsList = contents(day, contents);
        return contentsList
                .map(Box::toBox)
                .map(Present::surfaceArea)
                .reduce(Integer::sum)
                .orElse(0);
    }

    /**
     * --- Part Two ---
     * <p>
     * The elves are also running low on ribbon. Ribbon is all the same width,
     * so they only have to worry about the length they need to order, which they would again like to be exact.
     * <p>
     * The ribbon required to wrap a present is the shortest distance around its sides,
     * or the smallest perimeter of any one face. Each present also requires a bow made out of ribbon as well;
     * the feet of ribbon required for the perfect bow is equal to the cubic feet of volume of the present.
     * Don't ask how they tie the bow, though; they'll never tell.
     * <p>
     * For example:
     * <p>
     * - A present with dimensions 2x3x4 requires 2+2+3+3 = 10 feet of
     * ribbon to wrap the present plus 2*3*4 = 24 feet of ribbon for the bow, for a total of 34 feet. <br>
     * - A present with dimensions 1x1x10 requires 1+1+1+1 = 4 feet of ribbon to wrap the present plus
     * 1*1*10 = 10 feet of ribbon for the bow, for a total of 14 feet. <br>
     * How many total feet of ribbon should they order?
     *
     * @param day A text input for puzzle submission.
     * @param contents For testing.
     * @return Total feet of ribbon.
     */
    public static int part2(@Nullable String day, @Nullable String contents){
        Stream<String> contentsList = contents(day, contents);
        return contentsList
                .map(Box::toBox)
                .map(Present::totalFeet)
                .reduce(Integer::sum)
                .orElse(0);
    }
}
