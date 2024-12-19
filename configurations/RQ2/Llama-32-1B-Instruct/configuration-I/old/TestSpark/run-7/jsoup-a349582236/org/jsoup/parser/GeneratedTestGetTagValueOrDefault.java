package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTestGetTagValueOrDefault {

    @Test
    public void testGetTagValueOrDefault() {
        ParseSettings settings = new ParseSettings();
        String tagName = "p";
        Tag tag = new Tag();
        try {
            tag = Tag.valueOf(tagName, settings);
        } catch (Exception e) {
            fail("Got exception: " + e.getMessage());
        }
        assertEquals("unknown", tag.getValueOrDefault(settings));
    }

}