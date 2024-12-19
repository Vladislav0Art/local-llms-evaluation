package org.jsoup.parser;

public class GeneratedIsKnownTag_UnknownTag_ReturnsFalse {

    private Tag tag;

    @Test
    public void isKnownTag_UnknownTag_ReturnsFalse() {
        tag = new Tag();
        assertFalse(Tag.isKnownTag("unknown"));
    }

}