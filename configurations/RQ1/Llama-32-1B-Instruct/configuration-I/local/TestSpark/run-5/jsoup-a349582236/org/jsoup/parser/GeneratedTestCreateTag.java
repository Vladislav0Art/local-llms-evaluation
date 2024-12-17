package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestCreateTag {

    @Test
    public void testCreateTag() {
        // Test the createTag method of Tag class.
        String tagName = "span";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}