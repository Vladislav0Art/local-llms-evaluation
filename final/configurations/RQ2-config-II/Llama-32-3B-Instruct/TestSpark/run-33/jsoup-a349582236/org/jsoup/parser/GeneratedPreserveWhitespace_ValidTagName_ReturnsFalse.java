package org.jsoup.parser;

public class GeneratedPreserveWhitespace_ValidTagName_ReturnsFalse {

    @Test
    public void preserveWhitespace_ValidTagName_ReturnsFalse() {
        String tagName = "img";
        boolean actualResult = org.jsoup.parser.Tag.preserveWhitespace(tagName);
        assertFalse(actualResult);
    }

}