package org.jsoup.parser;

public class GeneratedIsKnownTag_KnownTag_ReturnsTrue {

    private Tag tag;

    @Test
    public void isKnownTag_KnownTag_ReturnsTrue() {
        tag = Tag.valueOf("p", null);
        assertTrue(tag.isKnownTag());
    }

}