package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedRightTrimReturnCorrectOutput {

    @Test
    public void rightTrimReturnCorrectOutput() {
        String input = "   Hello World";
        String expected = WordWrap.rightTrim(input);
        assertEquals(expected, "Hello World");
    }

}