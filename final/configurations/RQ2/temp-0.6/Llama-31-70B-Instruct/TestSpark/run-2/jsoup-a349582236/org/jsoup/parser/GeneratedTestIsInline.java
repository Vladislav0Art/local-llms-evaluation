package org.jsoup.parser;

public class GeneratedTestIsInline {

    @Test
    public void testIsInline() {
        assertFalse(Tag.valueOf("div").isInline());
        assertFalse(Tag.valueOf("p").isInline());
        assertTrue(Tag.valueOf("span").isInline());
    }

}