package org.jsoup.parser;

public class GeneratedTestIsBlockSelfClosingTag {

    @Mock
    private ParseSettings settings;

    @Test
    public void testIsBlockSelfClosingTag() {
        Tag tag = new Tag("self-closing-tag");
        assertTrue(tag.formatAsBlock());
    }

}