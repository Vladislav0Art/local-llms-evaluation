package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestIsKnownTag {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag();
    }

    @Test
    public void testIsKnownTag() {
        assertEquals(true, tag.isKnownTag("img"));
    }

}