package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestParseTag {

    @Test
    public void testParseTag() {
        String tag = new Tag().toString();
        assertEquals(tag, parseTag(tag));
    }

    private Tag parseTag(String tag) {
        try {
            return Tag.parse(tag).get();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid tag: " + tag);
        }
    }

}