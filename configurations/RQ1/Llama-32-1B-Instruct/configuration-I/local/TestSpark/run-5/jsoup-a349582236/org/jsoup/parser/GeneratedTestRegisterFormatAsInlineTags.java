package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterFormatAsInlineTags {

    @Test
    public void testRegisterFormatAsInlineTags() {
        // Test the register method of Tag class when the tag name is one of formatAsInlineTags.
        String tagName = "title";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}