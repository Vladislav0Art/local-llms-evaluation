package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsBlocked {

    @Test
    public void testIsBlocked() {
        // Create a block-level tag
        Tag tag = new Tag("div");

        // Set it to be blocked
        tag.setBlocked(true);

        // Check if it's still blocked
        assertTrue(tag.isBlocked());

        // Unblock the tag
        tag.setBlocked(false);

        // Check again
        assertFalse(tag.isBlocked());
    }

}