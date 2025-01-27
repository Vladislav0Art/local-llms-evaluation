package org.jsoup.parser;

public class GeneratedTestIsInlineNonSelfClosingTag {

    @Mock
    private ParseSettings settings;

    @Test
    public void testIsInlineNonSelfClosingTag() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

}