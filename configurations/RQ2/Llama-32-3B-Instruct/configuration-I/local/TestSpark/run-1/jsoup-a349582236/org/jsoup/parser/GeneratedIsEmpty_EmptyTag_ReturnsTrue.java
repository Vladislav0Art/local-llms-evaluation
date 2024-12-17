package org.jsoup.parser;

public class GeneratedIsEmpty_EmptyTag_ReturnsTrue {

    private Tag tag;

    @Test
    public void isEmpty_EmptyTag_ReturnsTrue() {
        tag = new Tag();
        assertTrue(tag.isEmpty());
    }

}