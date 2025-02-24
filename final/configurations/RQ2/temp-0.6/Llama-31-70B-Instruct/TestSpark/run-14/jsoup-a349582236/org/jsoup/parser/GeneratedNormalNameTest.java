package org.jsoup.parser;

public class GeneratedNormalNameTest {

    private static final String TAG_NAME = "div";
    private static final Tag tag = new Tag(TAG_NAME);
    private static final ParseSettings parseSettings = Mockito.mock(ParseSettings.class);

    @Test
    public void normalNameTest() {
        assertEquals(TAG_NAME.toLowerCase(), tag.normalName());
    }

}