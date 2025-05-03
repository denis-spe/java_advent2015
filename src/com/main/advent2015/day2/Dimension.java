/**
 * Bless be the name of LORD our GOD.
 */
package com.main.advent2015.day2;

/**
 * Dimension of the box presents
 */
public class Dimension {
    // An integer for dimension.
    final int value;

    /**
     * A constructor represent dimension value.
     * @param value A value for dimension.
     */
    Dimension(int value){
        this.value = value;
    }

    public static Dimension LENGTH(int value){
        return new Dimension(value);
    }

    public static Dimension WIDTH(int value){
        return new Dimension(value);
    }

    public static Dimension HEIGHT(int value){
        return new Dimension(value);
    }
}
