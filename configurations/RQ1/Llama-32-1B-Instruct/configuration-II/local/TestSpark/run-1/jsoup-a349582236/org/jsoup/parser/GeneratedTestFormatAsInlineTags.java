package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestFormatAsInlineTags {

    @Test
    public void testFormatAsInlineTags() {
        // Test case: Formatting inline text with format as block flag set to false
        Tag tag = new Tag("p", {"style":"display:block"});
        Tag registeredTag = Tag.register(tag);

        Validate.notNull(registeredTag, "Expected a registered tag");

        Validate.isNull(registeredTag.tagName, "Invalid tag name");
        Validate.isTrue(registeredTag.formatAsBlock(), "Incorrect format as block flag");
    }

}