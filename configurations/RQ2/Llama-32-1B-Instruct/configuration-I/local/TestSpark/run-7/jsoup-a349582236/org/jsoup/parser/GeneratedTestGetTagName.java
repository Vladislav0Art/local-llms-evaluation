package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTestGetTagName {

    @Test
    public void testGetTagName() {
        String tagName = "p";
        Tag tag = new Tag();
        try {
            tag = Tag.valueOf(tagName, settings);
        } catch (Exception e) {
            fail("Got exception: " + e.getMessage());
        }
        assertEquals("P", tag.getName());
    }

}