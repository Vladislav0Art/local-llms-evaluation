package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestFormatInline {

    @Test
    public void testFormatInline() {
        // Test case: Formatting inline text
        Tag tag = new Tag("p");
        tag.isBlock = false;
        tag.formatAsBlock = false;

        Tag registeredTag = Tag.register(tag);

        Validate.notNull(registeredTag, "Expected a registered tag");

        Validate.isNull(registeredTag.tagName, "Invalid tag name");
        Validate.isTrue(registeredTag.formatAsBlock(), "Incorrect format as block flag");
    }

}