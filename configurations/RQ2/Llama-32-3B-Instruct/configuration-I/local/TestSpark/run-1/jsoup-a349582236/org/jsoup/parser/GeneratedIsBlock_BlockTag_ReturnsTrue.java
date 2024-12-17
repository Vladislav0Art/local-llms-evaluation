package org.jsoup.parser;

public class GeneratedIsBlock_BlockTag_ReturnsTrue {

    private Tag tag;

    @Test
    public void isBlock_BlockTag_ReturnsTrue() {
        tag = new Tag("div");
        assertTrue(tag.isBlock());
    }

}