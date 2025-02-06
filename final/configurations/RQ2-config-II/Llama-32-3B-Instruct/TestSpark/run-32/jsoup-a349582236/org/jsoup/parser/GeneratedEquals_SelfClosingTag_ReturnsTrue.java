package org.jsoup.parser;

public class GeneratedEquals_SelfClosingTag_ReturnsTrue {

    @Test
    public void equals_SelfClosingTag_ReturnsTrue() {
        String tagName = "img";
        Tag tag1 = Tag.valueOf(tagName);
        Tag tag2 = Tag.valueOf(tagName);
        assertTrue(tag1.equals(tag2));
    }

}