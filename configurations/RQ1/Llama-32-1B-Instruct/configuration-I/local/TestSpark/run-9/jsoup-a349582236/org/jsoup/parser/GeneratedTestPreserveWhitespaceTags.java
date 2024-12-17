package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestPreserveWhitespaceTags {

    @Test
    public void testPreserveWhitespaceTags() {
        // Test preserve whitespace tags
        Tag tag = new Tag("div");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "div");
        assertSame(tag.isBlock(), true);

        tag = new Tag("");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "");
        assertSame(tag.isBlock(), false);
    }

}