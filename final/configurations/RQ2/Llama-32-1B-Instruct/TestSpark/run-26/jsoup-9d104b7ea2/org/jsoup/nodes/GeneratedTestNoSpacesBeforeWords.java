package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestNoSpacesBeforeWords {

    public String process(String input) {
        return input.replaceAll("\\s+", " ").trim();
    }

    @Test
    public void testNoSpacesBeforeWords() {
        String input = "Hello World";
        assertEquals(5, process(input));
    }

}