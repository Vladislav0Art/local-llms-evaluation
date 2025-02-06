package org.jsoup.parser;

public class GeneratedFormatAsBlock_InvalidTagName_ReturnsFalse {

    @Test
    public void formatAsBlock_InvalidTagName_ReturnsFalse() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.formatAsBlock(invalidTagName);
        assertFalse(actualResult);
    }

}