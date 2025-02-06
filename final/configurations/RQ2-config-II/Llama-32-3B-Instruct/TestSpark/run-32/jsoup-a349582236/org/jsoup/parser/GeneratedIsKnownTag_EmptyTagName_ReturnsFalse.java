package org.jsoup.parser;

public class GeneratedIsKnownTag_EmptyTagName_ReturnsFalse {

    @Test
    public void isKnownTag_EmptyTagName_ReturnsFalse() {
        String tagName = "";
        assertFalse(Tag.isKnownTag(tagName));
    }

}