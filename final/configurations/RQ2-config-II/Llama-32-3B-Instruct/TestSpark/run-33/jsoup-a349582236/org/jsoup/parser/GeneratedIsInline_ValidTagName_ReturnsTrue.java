package org.jsoup.parser;

public class GeneratedIsInline_ValidTagName_ReturnsTrue {

    @Test
    public void isInline_ValidTagName_ReturnsTrue() {
        String tagName = "span";
        boolean actualResult = org.jsoup.parser.Tag.isInline(tagName);
        assertTrue(actualResult);
    }

}