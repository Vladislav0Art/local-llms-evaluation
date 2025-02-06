package org.jsoup.parser;

public class GeneratedIsEmpty_ValidTagName_ReturnsTrue {

    @Test
    public void isEmpty_ValidTagName_ReturnsTrue() {
        String tagName = "img";
        boolean actualResult = org.jsoup.parser.Tag.isEmpty(tagName);
        assertTrue(actualResult);
    }

}