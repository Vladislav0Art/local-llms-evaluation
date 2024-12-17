package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestRegisterTag {

    @Test
    public void testRegisterTag() {
        // Test the register method of Tag class.
        String tagName = "div";
        Tag tag = new Main().createTag(tagName);
        Validate.notNull(tag);
        System.out.println("tag is not null: " + (tag != null ? "true" : "false"));
    }

}