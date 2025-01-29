package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestRemoveClass {

    @Test
    public void testRemoveClass() {
        // Test with no class name
        String removeClass = "";
        assertEquals("", customElement.removeClass(removeClass));

        // Test with non-empty class name
        removeClass = "hello";
        assertEquals("hello", customElement.removeClass(removeClass));
    }

}