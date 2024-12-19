package org.jsoup.parser;

public class GeneratedTestPreserveWhitespaceTags {

    @Test
    public void testPreserveWhitespaceTags() {
        Tag tag = new Tag("test");
        tag.preserveWhitespace = true;
        assertTrue(tag.preserveWhitespace());
    }

}