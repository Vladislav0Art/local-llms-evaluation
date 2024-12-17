package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestCreateTagEmptyFormatAsInlineTags {

    @Test
    public void testCreateTagEmptyFormatAsInlineTags() {
        // Test the createTag method of Tag class when the tag name is one of formatAsInlineTags and empty.
        String tagName = "span";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}