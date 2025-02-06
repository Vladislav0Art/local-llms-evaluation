package org.jsoup.parser;

public class GeneratedFormatAsBlock_InlineTagsReturnsTrue {

    @Test
    public void formatAsBlock_InlineTagsReturnsTrue() {
        assertTrue(Tag.valueOf("img").formatAsBlock());
        assertFalse(Tag.valueOf("div").formatAsBlock());
    }

}