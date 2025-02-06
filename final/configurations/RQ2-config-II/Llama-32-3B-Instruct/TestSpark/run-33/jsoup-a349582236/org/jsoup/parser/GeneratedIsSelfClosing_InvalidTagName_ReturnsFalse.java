package org.jsoup.parser;

public class GeneratedIsSelfClosing_InvalidTagName_ReturnsFalse {

    @Test
    public void isSelfClosing_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.isSelfClosing(invalidTagName);
        assertFalse(actualResult);
    }

}