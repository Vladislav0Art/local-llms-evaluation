package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestCreateTagFormListedTags {

    @Test
    public void testCreateTagFormListedTags() {
        // Test the createTag method of Tag class when the tag name is one of formListedTags.
        String tagName = "button";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}