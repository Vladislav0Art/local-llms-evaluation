package org.jsoup.parser;

public class GeneratedSetSelfClosing_ValidTagName_ReturnsTagObject {

    @Test
    public void setSelfClosing_ValidTagName_ReturnsTagObject() {
        Tag actualTag = new Tag();
        actualTag = org.jsoup.parser.Tag.setSelfClosing(actualTag, true);
        assertNotNull(actualTag);
    }

}