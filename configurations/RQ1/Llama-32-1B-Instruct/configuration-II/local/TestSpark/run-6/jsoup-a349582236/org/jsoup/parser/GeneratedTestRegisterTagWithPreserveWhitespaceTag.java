package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagWithPreserveWhitespaceTag {

    @Test
    public void testRegisterTagWithPreserveWhitespaceTag() {
        // Test that a tag with preserveWhitespace can be registered correctly
        String tagName = "tag";
        Tag tag = new Tag(tagName);
        Validate.notNull(tag);

        Assert.assertTrue(TagManager.tags.containsKey(tagName));

        // Test that the method returns false when an empty tag has already been registered
        Assert.assertFalse(TagManager.tags.containsKey(tagName));
    }

}