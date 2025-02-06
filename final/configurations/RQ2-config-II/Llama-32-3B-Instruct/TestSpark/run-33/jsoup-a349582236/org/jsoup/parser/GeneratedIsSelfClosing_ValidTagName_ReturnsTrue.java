package org.jsoup.parser;

public class GeneratedIsSelfClosing_ValidTagName_ReturnsTrue {

    @Test
    public void isSelfClosing_ValidTagName_ReturnsTrue() {
        String tagName = "img";
        boolean actualResult = org.jsoup.parser.Tag.isSelfClosing(tagName);
        assertTrue(actualResult);
    }

}