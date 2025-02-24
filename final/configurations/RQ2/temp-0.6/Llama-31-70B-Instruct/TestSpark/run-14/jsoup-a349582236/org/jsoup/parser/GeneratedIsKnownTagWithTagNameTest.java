package org.jsoup.parser;

public class GeneratedIsKnownTagWithTagNameTest {

    private static final String TAG_NAME = "div";
    private static final Tag tag = new Tag(TAG_NAME);
    private static final ParseSettings parseSettings = Mockito.mock(ParseSettings.class);

    @Test
    public void isKnownTagWithTagNameTest() {
        assertTrue(Tag.isKnownTag(TAG_NAME));
    }

}