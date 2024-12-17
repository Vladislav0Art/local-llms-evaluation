package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestValidateNotNoneTag {

    @Test
    public void testValidateNotNoneTag() {
        // Test the Validate.notNull method of Tag class.
        String tagName = "span";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}