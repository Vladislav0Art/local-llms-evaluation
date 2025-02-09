package org.jsoup.parser;

public class GeneratedWhenFormatAsBlockForInlineTagsThenFalse {

    private org.jsoup.parser.Tag tag;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private String tagName;

    public void setup() {
        tag = new org.jsoup.parser.Tag(tagName, parseSettings);
    }

    @Test
    public void whenFormatAsBlockForInlineTagsThenFalse() {
        assertFalse(tag.formatAsBlock());
    }

}