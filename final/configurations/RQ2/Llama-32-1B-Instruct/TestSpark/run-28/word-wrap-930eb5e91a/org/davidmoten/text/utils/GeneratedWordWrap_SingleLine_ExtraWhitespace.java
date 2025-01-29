package org.davidmoten.text.utils;

public class GeneratedWordWrap_SingleLine_ExtraWhitespace {

    @Test
    public void wordWrap_SingleLine_ExtraWhitespace() throws IOException {
        String input = "Hello World\n\tThis is another test string";
        System.out.println(wordWrap(input, "\n"));
    }

}