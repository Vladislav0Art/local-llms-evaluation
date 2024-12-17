package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestFormListedTags {

    @Test
    public void testFormListedTags() {
        // Test form listed tags
        Tag tag = new Tag("button");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "button");
        assertSame(tag.isBlock(), true);

        tag = new Tag("fieldset");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "fieldset");
        assertSame(tag.isBlock(), false);

        tag = new Tag("input");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "input");
        assertSame(tag.isBlock(), true);

        // Check form listed tags
        tag = new Tag("form");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "form");
        assertSame(tag.isBlock(), false);

        tag = new Tag("select");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "select");
        assertSame(tag.isBlock(), true);
    }

}