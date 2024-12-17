package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestCreateTagFormSubmitTags {

    @Test
    public void testCreateTagFormSubmitTags() {
        // Test the createTag method of Tag class when the tag name is one of formSubmitTags.
        String tagName = "input";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}