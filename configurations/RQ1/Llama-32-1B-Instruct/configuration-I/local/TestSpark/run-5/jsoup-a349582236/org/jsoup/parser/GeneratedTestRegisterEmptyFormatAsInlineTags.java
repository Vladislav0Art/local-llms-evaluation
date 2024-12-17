package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterEmptyFormatAsInlineTags {

    @Test
    public void testRegisterEmptyFormatAsInlineTags() {
        // Test the register method of Tag class when the tag name is one of formatAsInlineTags and empty.
        String tagName = "a";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}