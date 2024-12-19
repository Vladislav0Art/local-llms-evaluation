package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTestIsKnownTag {

    @Test
    public void testIsKnownTag() {
        String tagName = "p";
        Tag tag = new Tag();
        try {
            tag = Tag.valueOf(tagName, settings);
        } catch (Exception e) {
            fail("Got exception: " + e.getMessage());
        }
        assertTrue(Tag.isKnownTag(tagName));
    }

}