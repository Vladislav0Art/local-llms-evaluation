package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestAddClass {

    @Test
    public void testAddClass() {
        // Test with no class name
        String addClass = "";
        assertNotEquals(addClass, customElement.addClass(addClass));

        // Test with non-empty class name
        addClass = "hello";
        assertEquals("hello", customElement.addClass(addClass));
    }

}