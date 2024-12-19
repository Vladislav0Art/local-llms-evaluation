package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestFormedListTags {

    @Test
    public void testFormedListTags() {
        // Test case: Handling form listed tags
        Tag tag = new Tag("button", {"type":"", "class":""});
        Tag registeredTag = Tag.register(tag);

        Validate.notNull(registeredTag, "Expected a registered tag");

        Validate.isNull(registeredTag.tagName, "Invalid tag name");
        Validate.isTrue(registeredTag.formList(), "Incorrect form listed flag");
    }

}