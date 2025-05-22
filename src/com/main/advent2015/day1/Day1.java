package com.main.advent2015.day1;

import com.main.ExtractContents;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

/**
 * --- Day 1: Not Quite Lisp ---
 */
public class Day1 {
    /**
     * --- Part 1 ---
     * <p>
     * Santa was hoping for a white Christmas, but his weather machine's "snow" function is powered by stars, and he's
     * fresh out! To save Christmas, he needs you to collect fifty stars by December 25th.
     * <p>
     * Collect stars by helping Santa solve puzzles. Two puzzles will be made available on each day in
     * the Advent calendar; the second puzzle is unlocked when you complete the first. Each puzzle grants one star.
     * Good luck!
     * <p>
     * Here's an easy puzzle to warm you up.
     * <p>
     * Santa is trying to deliver presents in a large apartment building, but he can't find the right floor -
     * the directions he got are a little confusing. He starts on the first floor (floor 0) and
     * then follows the instructions one character at a time.
     * <p>
     * An opening parenthesis, (, means he should go up one floor, and a closing parenthesis, ),
     * means he should go down one floor.
     * <p>
     * The apartment building is very tall, and the basement is very deep; he will never find the top or
     * bottom floors.
     * <p>
     *
     * For example:
     * <p>
     * - (()) and ()() both result in floor 0. <br>
     * - ((( and (()(()( both result in floor 3. <br>
     * - ))((((( also results in floor 3. <br>
     * - ()) and ))( both result in floor -1 (the first basement level). <br>
     * - ))) and )())()) both result in floor -3.
     * <p>
     * To what floor do the instructions take Santa?
     *
     * @param day A text input for puzzle submission.
     * @param contents For testing.
     * @return a floor where santa will be.
     */
    public static int part1(@Nullable String day, @Nullable String contents){
        // Initialize the ExtractContents object.
        ExtractContents extractContents = new ExtractContents(day, contents, null);

        var finalFloor = toArray(extractContents.content)
                .stream()
                .map(Instruction::mapToInstruction)
                .map(Instruction::mapToValue)
                .reduce(Integer::sum);

        return finalFloor.orElse(0);
    }

    /**
     * --- Part Two ---
     * <p>
     * Now, given the same instructions, find the position of the first character that causes him to enter the basement
     * (floor -1). The first character in the instructions has position 1,
     * the second character has position 2, and so on.
     * <p>
     * For example:
     * <p>
     * - ) causes him to enter the basement at character position 1. <br>
     * - ()()) causes him to enter the basement at character position 5.
     * <p>
     * What is the position of the character that causes Santa to first enter the basement?
     *
     * @param day A text input for puzzle submission.
     * @param contents For testing.
     * @return position where santa enter the basement.
     */
    public static int part2(@Nullable String day, @Nullable String contents){
        // Initialize the ExtractContents object.
        ExtractContents extractContents = new ExtractContents(day, contents, null);

        var floors = toArray(extractContents.content)
                .stream()
                .map(Instruction::mapToInstruction)
                .map(Instruction::mapToValue)
                .toList();

        // Position that causes the santa to go to the basement
        int pos = 1;
        // The floor the santa is.
        int floor = 0;

        for (int fl: floors){
            floor += fl;

            if (floor < 0){
                break;
            }

            pos++;
        }


        return pos;
    }

    public static ArrayList<Character> toArray(String str){
        ArrayList<Character> arrayList = new ArrayList<>();

        for (char c: str.toCharArray()){
            arrayList.add(c);
        }
        return arrayList;
    }
}
