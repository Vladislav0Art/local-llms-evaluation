package org.jsoup.parser;

public class GeneratedIsInline_InlineTag_ReturnsTrue {

    private Tag tag;

    @Test
    public void isInline_InlineTag_ReturnsTrue() {
        tag = new Tag("span");
        assertTrue(tag.isInline());
    }

}