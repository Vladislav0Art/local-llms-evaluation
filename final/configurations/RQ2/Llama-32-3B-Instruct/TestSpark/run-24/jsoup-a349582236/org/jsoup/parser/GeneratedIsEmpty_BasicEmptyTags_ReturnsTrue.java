package org.jsoup.parser;

public class GeneratedIsEmpty_BasicEmptyTags_ReturnsTrue {

    @Test
    public void isEmpty_BasicEmptyTags_ReturnsTrue() {
        assertTrue(Tag.isEmpty("br"));
        assertTrue(Tag.isEmpty("<p></p>"));
        assertFalse(Tag.isEmpty("<p>Hello World</p>"));
    }

}