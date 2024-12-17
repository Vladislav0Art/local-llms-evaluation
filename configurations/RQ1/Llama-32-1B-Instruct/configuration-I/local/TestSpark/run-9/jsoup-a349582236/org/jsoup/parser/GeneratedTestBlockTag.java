package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestBlockTag {

    @Test
    public void testBlockTag() {
        // Test block tag
        Tag tag = new Tag("pre");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "pre");
        assertSame(tag.isBlock(), true);

        tag = new Tag("code");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "code");
        assertSame(tag.isBlock(), false);

        tag = new Tag("table");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "table");
        assertSame(tag.isBlock(), true);
    }

}