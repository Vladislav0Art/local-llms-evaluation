package org.jsoup.parser;

public class GeneratedGetName_EmptyTag_ReturnsEmptyString {

    private Tag tag;

    @Test
    public void getName_EmptyTag_ReturnsEmptyString() {
        tag = new Tag();
        assertEquals("", tag.getName());
    }

}