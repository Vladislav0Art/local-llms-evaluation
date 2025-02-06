package org.jsoup.parser;

public class GeneratedFormatAsBlock_ValidTagName_ReturnsTrue {

    @Test
    public void formatAsBlock_ValidTagName_ReturnsTrue() {
        String tagName = "p";
        boolean actualResult = org.jsoup.parser.Tag.formatAsBlock(tagName);
        assertTrue(actualResult);
    }

}