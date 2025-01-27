package org.jsoup.parser;

public class GeneratedFormatAsBlock_AcceptableBlocks_ReturnsTrue {

    @Test
    public void formatAsBlock_AcceptableBlocks_ReturnsTrue() {
        assertTrue(Tag.formatAsBlock("p"));
        assertTrue(Tag.formatAsBlock("table"));
        assertFalse(Tag.formatAsBlock("span"));
    }

}