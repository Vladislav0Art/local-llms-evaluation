package org.jsoup.parser;

public class GeneratedValueOf_ValidTagName_ReturnsTagObject {

    @Test
    public void valueOf_ValidTagName_ReturnsTagObject() {
        String tagName = "test";
        Tag actualTag = org.jsoup.parser.Tag.valueOf(tagName);
        assertNotNull(actualTag);
    }

}