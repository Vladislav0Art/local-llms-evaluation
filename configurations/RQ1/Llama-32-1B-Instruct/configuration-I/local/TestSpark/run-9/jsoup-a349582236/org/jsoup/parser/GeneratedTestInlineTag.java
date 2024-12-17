package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestInlineTag {

    @Test
    public void testInlineTag() {
        // Test inline tag
        Tag tag = new Tag("p");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "p");
        assertSame(tag.isBlock(), false);

        tag = new Tag("span");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "span");
        assertSame(tag.isBlock(), true);

        tag = new Tag("");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "");
        assertSame(tag.isBlock(), false);
    }

}