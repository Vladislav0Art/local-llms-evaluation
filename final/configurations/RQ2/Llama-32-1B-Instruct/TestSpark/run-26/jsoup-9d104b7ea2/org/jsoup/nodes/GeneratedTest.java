package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    public String process(String input) {
        return input.replaceAll("\\s+", " ").trim();
    }

    @Test
    public void testWordsAndSpaces() {
        String input = "Hello World";
        assertEquals(5, process(input));
    }

    @Test
    public void testMultipleWords() {
        String input = "This is a test string with multiple words";
        assertEquals(15, process(input));
    }

    @Test
    public void testNoSpacesBeforeWords() {
        String input = "Hello World";
        assertEquals(5, process(input));
    }

    @Test
    public void testEmptyString() {
        String input = "";
        assertEquals(0, process(input));
    }

    @Test
    public void testNoSpacesBetweenWords() {
        String input = "Hello";
        assertEquals(1, process(input));
    }

    @Test
    public void testMultipleLinesOfText() {
        String input = "\n\nThis is a long text with multiple lines.\nAnd also some other line.";
        assertEquals(40, process(input));
    }

}