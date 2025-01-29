package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestNoSpacesBetweenWords {

    public String process(String input) {
        return input.replaceAll("\\s+", " ").trim();
    }

    @Test
    public void testNoSpacesBetweenWords() {
        String input = "Hello";
        assertEquals(1, process(input));
    }

}