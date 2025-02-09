package org.jsoup.parser;

public class GeneratedGivenKnownTagNameWhenIsKnownTagThenTrue {

    private org.jsoup.parser.Tag tag;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private String tagName;

    public void setup() {
        tag = new org.jsoup.parser.Tag(tagName, parseSettings);
    }

    @Test
    public void givenKnownTagNameWhenIsKnownTagThenTrue() throws Exception {
        boolean expected = true;
        when(parseSettings.isKnownTag(tagName)).thenReturn(expected);
        assertTrue(tag.isKnownTag());
    }

}