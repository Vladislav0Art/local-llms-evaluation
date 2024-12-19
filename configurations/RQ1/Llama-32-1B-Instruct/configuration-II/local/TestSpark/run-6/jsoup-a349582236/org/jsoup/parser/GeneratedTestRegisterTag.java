package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTag {

    @Test
    public void testRegisterTag() {
        // Test the register method of Tag
        String tagName = "tag";
        Tag tag = new Tag(tagName);
        Validate.notNull(tag);

        // Test that the tag is registered correctly
        Assert.assertTrue(TagManager.tags.containsKey(tagName));
        Assert.assertEquals(1, TagManager.getTags().size());

        // Remove the tag to test it can be removed later
        tag.formatAsBlock = true;
        TagManager.tags.remove(tagName);
    }

}