package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterFormListedTags {

    @Test
    public void testRegisterFormListedTags() {
        // Test the register method of Tag class when the tag name is one of formListedTags.
        String tagName = "button";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}