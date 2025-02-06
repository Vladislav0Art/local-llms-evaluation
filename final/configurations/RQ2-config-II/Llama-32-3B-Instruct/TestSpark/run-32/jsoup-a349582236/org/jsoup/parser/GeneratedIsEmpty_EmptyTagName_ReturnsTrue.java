package org.jsoup.parser;

public class GeneratedIsEmpty_EmptyTagName_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTagName_ReturnsTrue() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isEmpty());
    }

}