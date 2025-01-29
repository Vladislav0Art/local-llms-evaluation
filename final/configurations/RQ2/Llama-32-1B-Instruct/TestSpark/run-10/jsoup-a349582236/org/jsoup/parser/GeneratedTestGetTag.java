package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetTag {

    @Test
    public void testGetTag() {
        String tag = new Tag("org.jsoup.parser.Tag");
        assertEquals(0, getTag(tag).getId());
    }

    private Tag getTag(Tag tag) {
        if (tag.startsWith("org.jsoup.parser.") || tag.startsWith("org.jsoup") || tag.endsWith(".Tag")) {
            return new Tag();
        } else {
            throw new IllegalArgumentException("Invalid tag: " + tag);
        }
    }

}