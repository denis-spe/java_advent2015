/**
 * Praise ye LORD GOD.
 */
package com.main.advent2015.day2;

import static com.main.advent2015.day2.Dimension.*;


/**
 * A class represents box dimension.
 */
public class Box {

    // Class variable
    Dimension length;
    Dimension width;
    Dimension heigth;

    Box(Dimension length, Dimension width, Dimension heigth){
        this.length = length;
        this.width = width;
        this.heigth = heigth;
    }

    /**
     * Map a string to dimension of the box present.
     * @return Dimension of the box present.
     */
    public static Box toBox(String dimension){
        // Split the string by x.
        String[] dims = dimension.split("x");

        // Parse the dimension to int.
        int length = Integer.parseInt(dims[0]);
        int width = Integer.parseInt(dims[1]);
        int height = Integer.parseInt(dims[2]);

        return new Box(LENGTH(length), WIDTH(width), HEIGHT(height));
    }

    @Override
    public String toString(){
        return "Box(" + "length=" +length.value + ", " + "width="+width.value + ", " + "height="+heigth.value + ")";
    }
}
