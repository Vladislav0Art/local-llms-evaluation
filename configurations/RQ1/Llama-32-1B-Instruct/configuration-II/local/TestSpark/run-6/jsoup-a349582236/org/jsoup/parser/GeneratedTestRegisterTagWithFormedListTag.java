package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagWithFormedListTag {

    @Test
    public void testRegisterTagWithFormedListTag() {
        // Test that a tag with formListed can be registered correctly
        String tagName = "tag";
        Tag tag = new Tag(tagName);
        Validate.notNull(tag);

        Assert.assertTrue(TagManager.tags.containsKey(tagName));

        // Test that the method returns false when an empty tag has already been registered
        Assert.assertFalse(TagManager.tags.containsKey(tagName));
    }

}