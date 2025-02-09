package org.jsoup.parser;

public class GeneratedGivenTagNameWhenValueOFThenReturnTag {

    private org.jsoup.parser.Tag tag;

    @Mock
    private ParseSettings parseSettings;

    @Mock
    private String tagName;

    public void setup() {
        tag = new org.jsoup.parser.Tag(tagName, parseSettings);
    }

    @Test
    public void givenTagNameWhenValueOFThenReturnTag() throws Exception {
        org.jsoup.parser.Tag expected = new org.jsoup.parser.Tag(tagName, parseSettings);
        org.jsoup.parser.Tag actual = org.jsoup.parser.Tag.valueOf(tagName, parseSettings);
        assertEquals(expected, actual);
        assertTrue(actual.equals(expected));
    }

}