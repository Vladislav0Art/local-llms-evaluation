package org.jsoup.parser;

public class GeneratedIsBlock_BasicBlockTags_ReturnsTrue {

    @Test
    public void isBlock_BasicBlockTags_ReturnsTrue() {
        assertTrue(Tag.isBlock("p"));
        assertTrue(Tag.isBlock("table"));
        assertFalse(Tag.isBlock("span"));
    }

}