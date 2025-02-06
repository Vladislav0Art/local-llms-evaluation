package org.jsoup.parser;

public class GeneratedIsInline_BlockTagsReturnsFalse {

    @Test
    public void isInline_BlockTagsReturnsFalse() {
        assertTrue(Tag.valueOf("<br>").isInline());
        assertFalse(Tag.valueOf("<p>").isInline());
    }

}