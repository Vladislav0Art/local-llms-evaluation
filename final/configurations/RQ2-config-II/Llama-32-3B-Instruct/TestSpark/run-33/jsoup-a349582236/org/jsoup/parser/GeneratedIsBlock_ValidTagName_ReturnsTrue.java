package org.jsoup.parser;

public class GeneratedIsBlock_ValidTagName_ReturnsTrue {

    @Test
    public void isBlock_ValidTagName_ReturnsTrue() {
        String tagName = "p";
        boolean actualResult = org.jsoup.parser.Tag.isBlock(tagName);
        assertTrue(actualResult);
    }

}