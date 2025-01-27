package org.jsoup.parser;

public class GeneratedIsKnownTag_KnownTagName_ReturnsTrue {

    @Test
    public void isKnownTag_KnownTagName_ReturnsTrue() {
        assertTrue(Tag.isKnownTag("img"));
        assertTrue(Tag.isKnownTag("<p>"));
        assertFalse(Tag.isKnownTag("invalid-tag"));
    }

}