package org.jsoup.parser;

public class GeneratedIsKnownTag_ValidTagName_ReturnsTrue {

    @Test
    public void isKnownTag_ValidTagName_ReturnsTrue() {
        String tagName = "p";
        boolean actualResult = org.jsoup.parser.Tag.isKnownTag(tagName);
        assertTrue(actualResult);
    }

}