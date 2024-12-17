package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestCreateTagEmptyFormSubmitTags {

    @Test
    public void testCreateTagEmptyFormSubmitTags() {
        // Test the createTag method of Tag class when the tag name is one of formSubmitTags and empty.
        String tagName = "div";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}