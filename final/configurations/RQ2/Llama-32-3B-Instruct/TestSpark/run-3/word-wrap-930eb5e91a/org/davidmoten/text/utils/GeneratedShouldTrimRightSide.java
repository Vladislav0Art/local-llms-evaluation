package org.davidmoten.text.utils;

public class GeneratedShouldTrimRightSide {

    @Test
    public void shouldTrimRightSide() {
        String input = "   Hello World  ";
        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, WordWrap.trimRight(input));
    }

}