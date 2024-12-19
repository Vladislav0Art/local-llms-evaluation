package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestFormSubmitTags {

    @Test
    public void testFormSubmitTags() {
        // Test case: Handling form submit tags
        Tag tag = new Tag("input", {"type":"", "name":""});
        Tag registeredTag = Tag.register(tag);

        Validate.notNull(registeredTag, "Expected a registered tag");

        Validate.isNull(registeredTag.tagName, "Invalid tag name");
        Validate.isTrue(registeredTag.formSubmit(), "Incorrect form submit flag");
    }

}