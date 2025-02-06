package org.jsoup.parser;

public class GeneratedIsKnownTag_InvalidTagName_ReturnsFalse {

    @Test
    public void isKnownTag_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.isKnownTag(invalidTagName);
        assertFalse(actualResult);
    }

}