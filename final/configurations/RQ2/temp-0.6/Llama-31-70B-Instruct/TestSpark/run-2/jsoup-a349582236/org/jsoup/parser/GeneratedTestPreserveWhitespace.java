package org.jsoup.parser;

public class GeneratedTestPreserveWhitespace {

    @Test
    public void testPreserveWhitespace() {
        assertTrue(Tag.valueOf("pre").preserveWhitespace());
        assertFalse(Tag.valueOf("span").preserveWhitespace());
    }

}