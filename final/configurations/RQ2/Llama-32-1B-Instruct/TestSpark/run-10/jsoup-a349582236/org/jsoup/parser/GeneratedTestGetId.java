package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetId {

    @Test
    public void testGetId() {
        String tag = new Tag().toString();
        assertEquals(0, getId(tag).getId());
    }

    private int getId(Tag tag) {
        if (tag.startsWith("org.jsoup.parser.") || tag.startsWith("org.jsoup") || tag.endsWith(".Tag")) {
            return 1;
        } else {
            throw new IllegalArgumentException("Invalid tag: " + tag);
        }
    }

}