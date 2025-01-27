package org.jsoup.parser;

public class GeneratedIsInline_AcceptableInlineTags_ReturnsTrue {

    @Test
    public void isInline_AcceptableInlineTags_ReturnsTrue() {
        assertTrue(Tag.isInline("img"));
        assertTrue(Tag.isInline("a"));
        assertFalse(Tag.isInline("div"));
    }

}