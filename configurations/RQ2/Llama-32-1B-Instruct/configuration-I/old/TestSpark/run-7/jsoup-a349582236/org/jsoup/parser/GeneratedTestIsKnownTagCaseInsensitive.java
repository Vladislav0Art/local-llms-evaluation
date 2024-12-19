package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTestIsKnownTagCaseInsensitive {

    @Test
    public void testIsKnownTagCaseInsensitive() {
        String tagName = "P";
        Tag tag = new Tag();
        try {
            tag = Tag.valueOf(tagName, settings);
        } catch (Exception e) {
            fail("Got exception: " + e.getMessage());
        }
        assertTrue(Tag.isKnownTag(tagName));
    }

}