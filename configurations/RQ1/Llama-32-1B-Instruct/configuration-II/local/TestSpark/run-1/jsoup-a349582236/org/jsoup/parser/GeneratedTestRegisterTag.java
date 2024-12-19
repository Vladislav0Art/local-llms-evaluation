package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTag {

    @Test
    public void testRegisterTag() {
        // Test case: Registering a tag
        Tag tag = new Tag("div");
        Tag registeredTag = Tag.register(tag);

        Validate.notNull(registeredTag, "Expected a registered tag");

        Validate.isNull(registeredTag.tagName, "Invalid tag name");
        Validate.isTrue(registeredTag.formatAsBlock(), "Incorrect format as block flag");
    }

}