package org.jsoup.parser;

import org.junit.Test;

public class GeneratedTestFormatAsInlineTags {

    @Test
    public void testFormatAsInlineTags() {
        // Test format as inline tags
        Tag tag = new Tag("script");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "script");
        assertSame(tag.formatAsBlock(), true);

        tag = new Tag("style");
        assertNotSame(tag, null);
        assertSame(tag.getTagName(), "style");
        assertSame(tag.formatAsBlock(), false);

        tag = tags.get("title");
        validate.notNull(tag);
        assertSame(tag.getTagName(), "title");
        assertSame(tag.formatAsBlock(), true);
    }

}