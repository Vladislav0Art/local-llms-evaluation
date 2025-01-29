package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestVal {

    @Test
    public void testVal() {
        // Test with empty value
        String val = "";
        assertEquals("", customElement.val(val));

        // Test with non-empty value
        val = "Hello World";
        assertEquals("Hello World", customElement.val(val));
    }

}