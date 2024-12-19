package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestGetTags {

    @Test
    public void testGetTags() {
        // Test that getTags returns all registered tags
        String tagName = "tag";
        Tag tag = new Tag(tagName);
        Validate.notNull(tag);

        Assert.assertTrue(TagManager.getTags().contains(tag));
    }

}