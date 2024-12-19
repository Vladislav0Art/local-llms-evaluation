package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsBlock {

    @Test
    public void testIsBlock() {
        // Create a block-level tag
        Tag tag = new Tag("div");

        // Check if it's blocked
        assertTrue(tag.isBlocked());

        // Unblock the tag
        tag.setBlocked(false);

        // Check again
        assertFalse(tag.isBlocked());
    }

}