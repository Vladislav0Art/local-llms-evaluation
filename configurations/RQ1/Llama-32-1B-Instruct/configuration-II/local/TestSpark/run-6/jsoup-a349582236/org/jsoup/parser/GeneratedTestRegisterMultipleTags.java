package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterMultipleTags {

    @Test
    public void testRegisterMultipleTags() {
        // Test that multiple tags are registered correctly
        String tagName1 = "tag";
        String tagName2 = "tag";
        Tag tag1 = new Tag(tagName1);
        Tag tag2 = new Tag(tagName2);

        Validate.notNull(tag1);
        Validate.notNull(tag2);

        Assert.assertTrue(TagManager.tags.containsKey(tagName1));
        Assert.assertFalse(TagManager.tags.containsKey(tagName2));

        TagManager.tags.put(tagName1, tag1);
        TagManager.tags.put(tagName2, tag2);

        // Test that tags can be retrieved correctly
        Assert.assertEquals(2, TagManager.getTags().size());
    }

}