package org.jsoup.parser;

public class GeneratedGetName_EmptyTagNameReturnsEmptyString {

    @Test
    public void getName_EmptyTagNameReturnsEmptyString() {
        assertEquals("", Tag.valueOf("").getName());
    }

}