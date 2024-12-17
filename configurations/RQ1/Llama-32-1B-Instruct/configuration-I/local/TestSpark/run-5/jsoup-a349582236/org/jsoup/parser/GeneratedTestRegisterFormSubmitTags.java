package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterFormSubmitTags {

    @Test
    public void testRegisterFormSubmitTags() {
        // Test the register method of Tag class when the tag name is one of formSubmitTags.
        String tagName = "input";
        try {
            Main.createTag(tagName);
            fail("Expected an exception to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}