package org.jsoup.parser;

public class GeneratedIsBlock_EmptyTagName_ReturnsFalse {

    @Test
    public void isBlock_EmptyTagName_ReturnsFalse() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isBlock());
    }

}