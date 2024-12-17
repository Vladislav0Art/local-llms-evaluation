package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestFormSubmitTags {

    @Test
    public void testFormSubmitTags() {
        // Test form submit tags
        Tag tag = new Tag("input");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "input");
        assertSame(tag.isBlock(), false);

        tag = new Tag("keygen");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "keygen");
        assertSame(tag.isBlock(), true);

        tag = new Tag("button");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "button");
        assertSame(tag.isBlock(), false);
    }

}