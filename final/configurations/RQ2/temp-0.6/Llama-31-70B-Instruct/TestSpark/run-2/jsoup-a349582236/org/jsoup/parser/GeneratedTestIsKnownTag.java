package org.jsoup.parser;

public class GeneratedTestIsKnownTag {

    @Test
    public void testIsKnownTag() {
        assertTrue(Tag.isKnownTag("p"));
        assertTrue(Tag.isKnownTag("div"));
        assertFalse(Tag.isKnownTag("unknown-tag"));
    }

}