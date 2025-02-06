package org.jsoup.parser;

public class GeneratedValueOf_SimpleTagName_ReturnsTagInstance {

    @Test
    public void valueOf_SimpleTagName_ReturnsTagInstance() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertNotNull(tag);
    }

}