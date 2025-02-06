package org.jsoup.parser;

public class GeneratedIsInline_SimpleTagName_ReturnsFalse {

    @Test
    public void isInline_SimpleTagName_ReturnsFalse() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isInline());
    }

}