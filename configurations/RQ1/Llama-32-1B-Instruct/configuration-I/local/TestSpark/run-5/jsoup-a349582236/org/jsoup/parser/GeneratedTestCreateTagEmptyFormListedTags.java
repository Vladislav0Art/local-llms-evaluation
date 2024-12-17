package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestCreateTagEmptyFormListedTags {

    @Test
    public void testCreateTagEmptyFormListedTags() {
        // Test the createTag method of Tag class when the tag name is one of formListedTags and empty.
        String tagName = "li";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}