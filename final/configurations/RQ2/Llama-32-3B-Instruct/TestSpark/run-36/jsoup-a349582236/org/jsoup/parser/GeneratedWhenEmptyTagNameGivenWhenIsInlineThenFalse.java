package org.jsoup.parser;

public class GeneratedWhenEmptyTagNameGivenWhenIsInlineThenFalse {

    private org.jsoup.parser.Tag tag;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private String tagName;

    public void setup() {
        tag = new org.jsoup.parser.Tag(tagName, parseSettings);
    }

    @Test
    public void whenEmptyTagNameGivenWhenIsInlineThenFalse() {
        assertFalse(tag.isInline());
    }

}