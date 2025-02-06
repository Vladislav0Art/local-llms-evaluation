package org.jsoup.parser;

public class GeneratedIsBlock_InvalidTagName_ReturnsFalse {

    @Test
    public void isBlock_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.isBlock(invalidTagName);
        assertFalse(actualResult);
    }

}