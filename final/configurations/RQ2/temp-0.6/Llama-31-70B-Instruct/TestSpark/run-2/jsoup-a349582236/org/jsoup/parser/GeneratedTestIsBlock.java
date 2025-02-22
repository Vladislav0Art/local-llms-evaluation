package org.jsoup.parser;

public class GeneratedTestIsBlock {

    @Test
    public void testIsBlock() {
        assertTrue(Tag.valueOf("div").isBlock());
        assertTrue(Tag.valueOf("p").isBlock());
        assertFalse(Tag.valueOf("span").isBlock());
    }

}