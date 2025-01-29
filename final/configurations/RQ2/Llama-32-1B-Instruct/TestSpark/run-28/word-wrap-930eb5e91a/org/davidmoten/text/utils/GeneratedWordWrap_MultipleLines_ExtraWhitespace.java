package org.davidmoten.text.utils;

public class GeneratedWordWrap_MultipleLines_ExtraWhitespace {

    @Test
    public void wordWrap_MultipleLines_ExtraWhitespace() throws IOException {
        String input = "This is a test string with multiple lines.\nIt has spaces and tabs.";
        System.out.println(wordWrap(input, "\n\t"));
    }

}