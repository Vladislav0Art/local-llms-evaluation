package org.jsoup.parser;

public class GeneratedPreserveWhitespace_AcceptableTagsPreserveWhitespace_ReturnsTrue {

    @Test
    public void preserveWhitespace_AcceptableTagsPreserveWhitespace_ReturnsTrue() {
        assertTrue(Tag.preserveWhitespace("span"));
        assertTrue(Tag.preserveWhitespace("<input type='image'>"));
        assertFalse(Tag.preserveWhitespace("img"));
    }

}