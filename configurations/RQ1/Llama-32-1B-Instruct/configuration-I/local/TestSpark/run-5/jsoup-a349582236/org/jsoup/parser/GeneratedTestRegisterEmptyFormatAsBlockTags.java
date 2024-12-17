package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterEmptyFormatAsBlockTags {

    @Test
    public void testRegisterEmptyFormatAsBlockTags() {
        // Test the register method of Tag class when the tag name is one of formatAsBlockTags and empty.
        String tagName = "span";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}