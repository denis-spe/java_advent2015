package com.main;

import org.jetbrains.annotations.Nullable;

public class ExtractContents {

    // Class variable
    public final String content;

    /**
     * Parts Constructor
     * @param day name from the advent 2015 like day1, day2 etc.
     */
    public ExtractContents(@Nullable String day, @Nullable String contents) {
        if (day != null) {
            TxtFileReader txtFileReader = new TxtFileReader(day);
            this.content = txtFileReader.contents();
        } else if (contents != null) {
            this.content = contents;
        } else {
            throw new IllegalArgumentException("Invalid argument passed.");
        }
    }
}
