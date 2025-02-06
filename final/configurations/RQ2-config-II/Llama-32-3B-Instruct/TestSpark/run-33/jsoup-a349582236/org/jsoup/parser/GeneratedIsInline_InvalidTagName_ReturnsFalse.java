package org.jsoup.parser;

public class GeneratedIsInline_InvalidTagName_ReturnsFalse {

    @Test
    public void isInline_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.isInline(invalidTagName);
        assertFalse(actualResult);
    }

}