package org.jsoup.parser;

public class GeneratedToString_SimpleTagName_ReturnsTagName {

    @Test
    public void toString_SimpleTagName_ReturnsTagName() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertNotNull(tag.toString());
    }

}