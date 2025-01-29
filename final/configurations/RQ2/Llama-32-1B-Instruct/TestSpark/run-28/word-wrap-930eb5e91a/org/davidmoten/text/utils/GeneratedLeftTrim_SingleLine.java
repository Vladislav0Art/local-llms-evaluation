package org.davidmoten.text.utils;

public class GeneratedLeftTrim_SingleLine {

    @Test
    public void leftTrim_SingleLine() throws IOException {
        String input = "Hello World\tThis is a test string";
        System.out.println(leftTrim(input));
    }

}