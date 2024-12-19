package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestValidTags {

    @Test
    public void testValidTags() {
        // Test case: Validating tags
        Tag tag = new Tag("div", {"class":""});
        Tag registeredTag = Tag.register(tag);

        Validate.notNull(registeredTag, "Expected a registered tag");

        Validate.isNull(registeredTag.tagName, "Invalid tag name");
    }

}