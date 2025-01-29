package org.davidmoten.text.utils;

public class GeneratedWordWrap_MultipleLines_SingleLine {

    @Test
    public void wordWrap_MultipleLines_SingleLine() throws IOException {
        String input = "This is a test string with multiple lines.\nIt has spaces and tabs. This is another line.";
        System.out.println(wordWrap(input));
    }

}