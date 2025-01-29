package org.jsoup.parser;

public class GeneratedTestPreserveWhitespace {

    @Test
    public void testPreserveWhitespace() {
        String tagName = "p";
        Tag tag = org.jsoup.parser.Tag.valueOf(tagName);
        boolean result = tag.preserveWhitespace();
        assertTrue(result);
    }

}