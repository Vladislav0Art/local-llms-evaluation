package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestMultipleLinesOfText {

    public String process(String input) {
        return input.replaceAll("\\s+", " ").trim();
    }

    @Test
    public void testMultipleLinesOfText() {
        String input = "\n\nThis is a long text with multiple lines.\nAnd also some other line.";
        assertEquals(40, process(input));
    }

}