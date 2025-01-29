package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestHashCode {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag();
    }

    @Test
    public void testHashCode() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertEquals(assertEquals(tag1.hashCode(), tag2.hashCode()));
    }

    @Before
    public void setUpTag2() {
        tag.setSelfClosing(true);
    }

}