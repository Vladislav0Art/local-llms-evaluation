package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestToString {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag();
    }

    @Test
    public void testToString() {
        String tagName = "span";
        Tag tag = new Tag();
        tag.setName(tagName);
        assertTrue(tag.toString().contains(tagName));
    }

}