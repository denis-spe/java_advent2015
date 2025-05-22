/**
 * Holy holy, holy is the LORD of host.
 */
package com.main.advent2015.day2;

import java.util.Arrays;

/**
 * A class represents Box present
 */
public class Present {

    /**
     * Compute the area of the smallest side.
     * @param length A box present length.
     * @param heigth A box present height.
     * @param width A box present width.
     * @return The area of the smallest side.
     */
    private static int smallestArea(int length, int heigth, int width){
        int min1, min2;

        // Create the array and sort it in ascending order.
        int[] array = {length, heigth, width};
        Arrays.sort(array);

        // Assign min1 and min2
        min1 = array[0];
        min2 = array[1];

        return min1 * min2;
    }

    /**
     * find the surface area of the box, which is 2*l*w + 2*w*h + 2*h*l.
     * The elves also need a little extra paper for each present: the area of the smallest side.
     * @param box A box present.
     * @return The surface area of the box present.
     */
    public static int surfaceArea(Box box){
        int length = box.length.value;
        int heigth = box.heigth.value;
        int width = box.width.value;

        int sArea = ((2 * length * width) + (2 * width * heigth) + (2 * heigth * length));
        int extraPaper = smallestArea(length, heigth, width);

        return sArea + extraPaper;
    }

    /**
     * Calculates the feet of ribbon to wrap the present
     * @param length A box present length.
     * @param heigth A box present height.
     * @param width A box present width.
     * @return The feet of ribbon to wrap the present
     */
    private static int feetRibbonWarp(int length, int heigth, int width){
        int min1, min2;

        // Create the array and sort it in ascending order.
        int[] array = {length, heigth, width};
        Arrays.sort(array);

        // Assign min1 and min2
        min1 = array[0];
        min2 = array[1];

        return min1 + min1 + min2 + min2;
    }

    /**
     * Calculates the feet of ribbon for the bow.
     * @param length A box present length.
     * @param heigth A box present height.
     * @param width A box present width.
     * @return The feet of ribbon for the bow.
     */
    private static int feetRibbonBow(int length, int heigth, int width){
        return length * heigth * width;
    }

    /**
     * Computes the total feet of ribbon.
     * @param box A box present.
     * @return The total feet.
     */
    public static int totalFeet(Box box){
        int length = box.length.value;
        int heigth = box.heigth.value;
        int width = box.width.value;

        return feetRibbonBow(length, heigth, width) +
                feetRibbonWarp(length, heigth, width);
    }
}
