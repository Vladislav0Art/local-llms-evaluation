package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestEmptyTag {

    @Test
    public void testEmptyTag() {
        // Test empty tag
        Tag tag = tags.get("meta");
        Validate.notNull(tag);

        tag.empty = true;
        tag.formatAsBlock = true;
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "base");

        tag = new Tag("title");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "title");
        assertSame(tag.isBlock(), false);

        tag = tags.get("link");
        validate.notNull(tag);
        tag.formatAsBlock = true;
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "h1");

        tag = new Tag("");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "");
        assertSame(tag.isBlock(), false);
    }

}