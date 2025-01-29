package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestToggleClass {

    @Test
    public void testToggleClass() {
        // Test with no class name
        String toggleClass = "";
        assertEquals("", customElement.toggleClass(toggleClass));

        // Test with non-empty class name
        toggleClass = "hello";
        assertEquals("hello", customElement.toggleClass(toggleClass));
    }

}