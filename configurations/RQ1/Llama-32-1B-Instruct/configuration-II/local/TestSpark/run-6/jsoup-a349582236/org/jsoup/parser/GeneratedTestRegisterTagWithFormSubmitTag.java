package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagWithFormSubmitTag {

    @Test
    public void testRegisterTagWithFormSubmitTag() {
        // Test that a tag with formSubmit can be registered correctly
        String tagName = "tag";
        Tag tag = new Tag(tagName);
        Validate.notNull(tag);

        Assert.assertTrue(TagManager.tags.containsKey(tagName));

        // Test that the method returns false when an empty tag has already been registered
        Assert.assertFalse(TagManager.tags.containsKey(tagName));
    }

}