package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestCreateTagFormatAsBlockTags {

    @Test
    public void testCreateTagFormatAsBlockTags() {
        // Test the createTag method of Tag class when the tag name is one of formatAsBlockTags.
        String tagName = "script";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}