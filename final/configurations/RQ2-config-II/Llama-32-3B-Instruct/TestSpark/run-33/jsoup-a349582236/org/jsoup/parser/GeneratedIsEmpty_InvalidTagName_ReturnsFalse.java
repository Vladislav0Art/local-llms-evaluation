package org.jsoup.parser;

public class GeneratedIsEmpty_InvalidTagName_ReturnsFalse {

    @Test
    public void isEmpty_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.isEmpty(invalidTagName);
        assertFalse(actualResult);
    }

}