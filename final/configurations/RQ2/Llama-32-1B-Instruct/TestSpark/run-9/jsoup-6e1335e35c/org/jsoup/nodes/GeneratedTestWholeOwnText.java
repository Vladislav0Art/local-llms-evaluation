package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestWholeOwnText {

    @Test
    public void testWholeOwnText() {
        // Test with empty string
        String wholeOwnText = "";
        assertEquals("", customElement.wholeOwnText(wholeOwnText));

        // Test with non-empty string
        wholeOwnText = "Hello World";
        assertEquals("Hello World", customElement.wholeOwnText(wholeOwnText));
    }

}