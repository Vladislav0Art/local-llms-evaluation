package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestValidateTagName {

    @Test
    public void testValidateTagName() {
        // Test the Validate.notNull method of Tag class.
        String tagName = null;
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}