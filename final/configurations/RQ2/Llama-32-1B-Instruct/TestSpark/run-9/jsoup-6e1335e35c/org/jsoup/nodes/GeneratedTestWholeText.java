package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestWholeText {

    @Test
    public void testWholeText() {
        // Test with empty string
        String wholeText = "";
        assertEquals("", customElement.wholeText(wholeText));

        // Test with non-empty string
        wholeText = "Hello World";
        assertEquals("Hello World", customElement.wholeText(wholeText));
    }

}