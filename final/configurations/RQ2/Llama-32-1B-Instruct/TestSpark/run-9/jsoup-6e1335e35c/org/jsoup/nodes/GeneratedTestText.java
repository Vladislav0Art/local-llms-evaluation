package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestText {

    @Test
    public void testText() {
        // Test with empty string
        String text = "";
        assertEquals("", customElement.text(text));

        // Test with non-empty string
        text = "Hello";
        assertEquals("Hello", customElement.text(text));
    }

}