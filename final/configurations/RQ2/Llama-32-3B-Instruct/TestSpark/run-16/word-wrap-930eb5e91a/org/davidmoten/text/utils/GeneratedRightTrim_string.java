package org.davidmoten.text.utils;

public class GeneratedRightTrim_string {

    @Test
    public void rightTrim_string() {
        String input = "   Hello World   ";
        String expectedOutput = "Hello World";
        String actualOutput = WordWrap.rightTrim(input);
        assertEquals(expectedOutput, actualOutput);
    }

}