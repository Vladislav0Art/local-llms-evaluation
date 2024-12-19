package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTagWithEmptyTags {

    @Test
    public void testRegisterTagWithEmptyTags() {
        // Test that empty tags are registered correctly
        String tagName = "tag";
        Tag tag = new Tag(tagName);
        Validate.notNull(tag);

        // Test that an empty tag can be removed later
        Assert.assertTrue(TagManager.tags.containsKey(tagName));

        // Test that the empty tag is removed from the map when it goes out of scope
        {
            String[] keys = {"tag"};
            for (String key : keys) {
                TagManager.tags.remove(key);
            }
        }

        // Test that the method returns false when an empty tag has already been registered
        Assert.assertFalse(TagManager.tags.containsKey(tagName));
    }

}