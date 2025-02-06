package org.jsoup.parser;

public class GeneratedPreserveWhitespace_InvalidTagName_ReturnsTrue {

    @Test
    public void preserveWhitespace_InvalidTagName_ReturnsTrue() {
        String invalidTagName = null;
        boolean actualResult = org.jsoup.parser.Tag.preserveWhitespace(invalidTagName);
        assertTrue(actualResult);
    }

}