package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOwnText {

    @Test
    public void testOwnText() {
        // Test with empty string
        String ownText = "";
        assertEquals("", customElement.ownText(ownText));

        // Test with non-empty string
        ownText = "Hello";
        assertEquals("Hello", customElement.ownText(ownText));
    }

}