package org.jsoup.parser;

public class GeneratedNormalName_EmptyTagName_ReturnsEmptyString {

    @Test
    public void normalName_EmptyTagName_ReturnsEmptyString() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertEquals("", tag.normalName());
    }

}