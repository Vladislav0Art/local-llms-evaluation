package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestPreserveWhitespaceTags {

    @Test
    public void testPreserveWhitespaceTags() {
        // Test case: Handling preserve whitespace tags
        Tag tag = new Tag("pre", {"style":"white-space:collapse;"});
        Tag registeredTag = Tag.register(tag);

        Validate.notNull(registeredTag, "Expected a registered tag");

        Validate.isNull(registeredTag.tagName, "Invalid tag name");
        Validate.isTrue(registeredTag.preserveWhitespace(), "Incorrect preserve whitespace flag");
    }

}