package org.jsoup.parser;

public class GeneratedGetName_EmptyTagName_ReturnsEmptyString {

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertEquals("", tag.getName());
    }

}