package org.davidmoten.text.utils;

public class GeneratedWordWrap_SingleLine_Whitespace {

    @Test
    public void wordWrap_SingleLine_Whitespace() throws IOException {
        String input = "Hello World";
        System.out.println(wordWrap(input, "\n"));
    }

}