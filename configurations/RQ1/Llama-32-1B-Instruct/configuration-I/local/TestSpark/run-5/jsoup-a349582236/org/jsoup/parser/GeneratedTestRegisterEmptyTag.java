package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterEmptyTag {

    @Test
    public void testRegisterEmptyTag() {
        // Test the register method of Tag class when the tag name is empty.
        String tagName = "";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}