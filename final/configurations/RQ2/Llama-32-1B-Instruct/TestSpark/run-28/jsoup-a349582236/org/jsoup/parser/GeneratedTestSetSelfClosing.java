package org.jsoup.parser;

import org.junit.Before;
import org.junit.Test;

public class GeneratedTestSetSelfClosing {

    private Tag tag;

    @Before
    public void setUp() {
        tag = new Tag();
    }

    @Test
    public void testSetSelfClosing() {
        Tag tag2 = new Tag();
        tag2.setSelfClosing(true);
        assertTrue(tag.isKnownTag("img"));
    }

    @Before
    public void tearDown() {
    }

}