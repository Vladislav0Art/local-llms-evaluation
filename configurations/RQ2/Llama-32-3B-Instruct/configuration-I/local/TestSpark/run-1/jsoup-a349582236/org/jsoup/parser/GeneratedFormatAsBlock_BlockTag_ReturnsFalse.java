package org.jsoup.parser;

public class GeneratedFormatAsBlock_BlockTag_ReturnsFalse {

    private Tag tag;

    @Test
    public void formatAsBlock_BlockTag_ReturnsFalse() {
        tag = new Tag("div");
        assertFalse(tag.formatAsBlock());
    }

}