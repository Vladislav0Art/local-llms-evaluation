package org.jsoup.parser;

public class GeneratedGetName_SimpleTagName_ReturnsTagName {

    @Test
    public void getName_SimpleTagName_ReturnsTagName() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertEquals("div", tag.getName());
    }

}