package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTestGetTagNameCaseInsensitive {

    @Test
    public void testGetTagNameCaseInsensitive() {
        String tagName = "P";
        Tag tag = new Tag();
        try {
            tag = Tag.valueOf(tagName, settings);
        } catch (Exception e) {
            fail("Got exception: " + e.getMessage());
        }
        assertEquals("p", tag.getName());
    }

}