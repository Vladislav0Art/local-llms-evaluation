package org.jsoup.parser;

public class GeneratedIsBlock_InlineTagsReturnsFalse {

    @Test
    public void isBlock_InlineTagsReturnsFalse() {
        assertTrue(Tag.valueOf("span").isBlock());
        assertFalse(Tag.valueOf("a").isBlock());
    }

}