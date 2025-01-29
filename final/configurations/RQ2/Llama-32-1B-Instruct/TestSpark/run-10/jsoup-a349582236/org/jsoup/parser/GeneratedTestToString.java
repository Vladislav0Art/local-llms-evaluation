package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        String tag = new Tag().toString();
        assertEquals("org.jsoup.parser.Tag", toString(tag));
    }

    private String toString(Tag tag) {
        if (tag == null) {
            throw new IllegalArgumentException("Tag cannot be null");
        } else {
            return tag.toString();
        }
    }

}