package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestCreateTagEmptyTagName {

    @Test
    public void testCreateTagEmptyTagName() {
        // Test the createTag method of Tag class when the tag name is empty.
        String tagName = "";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}