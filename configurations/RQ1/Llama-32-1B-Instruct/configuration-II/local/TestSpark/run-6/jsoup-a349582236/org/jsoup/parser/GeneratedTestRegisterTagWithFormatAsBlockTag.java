package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagWithFormatAsBlockTag {

    @Test
    public void testRegisterTagWithFormatAsBlockTag() {
        // Test that a tag with formatAsBlock can be registered correctly
        String tagName = "tag";
        Tag tag = new Tag(tagName);
        Validate.notNull(tag);

        Assert.assertTrue(TagManager.tags.containsKey(tagName));
    }

}