package org.jsoup.parser;

public class GeneratedGivenUnknownTagNameWhenIsKnownTagThenFalse {

    private org.jsoup.parser.Tag tag;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private String tagName;

    public void setup() {
        tag = new org.jsoup.parser.Tag(tagName, parseSettings);
    }

    @Test
    public void givenUnknownTagNameWhenIsKnownTagThenFalse() throws Exception {
        boolean expected = false;
        when(parseSettings.isKnownTag("unknown")).thenReturn(expected);
        assertFalse(tag.isKnownTag());
    }

}