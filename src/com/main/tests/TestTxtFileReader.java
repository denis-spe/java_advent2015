// Praise Be The LORD of host.
package com.main.tests;

import com.main.TxtFileReader;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestTxtFileReader {

    // Class variable
    TxtFileReader txtFileReader;

    @Before
    public void setup(){
        txtFileReader = new TxtFileReader("day1", null);
    }
    @Test
    public void content(){
        assertTrue(txtFileReader.contents().contains("()"));
    }

    @Test
    public void TestSpaceInContents(){
        var chars = txtFileReader.contents().toCharArray();
        for (char c: chars)
            assertNotEquals(' ', c);
        assertFalse(txtFileReader.contents().contains(" "));
    }
}
