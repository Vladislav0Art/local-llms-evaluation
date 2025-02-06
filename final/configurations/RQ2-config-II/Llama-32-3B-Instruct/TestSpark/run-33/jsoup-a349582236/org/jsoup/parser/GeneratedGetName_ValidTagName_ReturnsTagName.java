package org.jsoup.parser;

public class GeneratedGetName_ValidTagName_ReturnsTagName {

    @Test
    public void getName_ValidTagName_ReturnsTagName() {
        String tagName = "test";
        String actualName = org.jsoup.parser.Tag.getName(tagName);
        assertEquals(tagName, actualName);
    }

}