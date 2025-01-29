package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestMultipleWords {

    public String process(String input) {
        return input.replaceAll("\\s+", " ").trim();
    }

    @Test
    public void testMultipleWords() {
        String input = "This is a test string with multiple words";
        assertEquals(15, process(input));
    }

}