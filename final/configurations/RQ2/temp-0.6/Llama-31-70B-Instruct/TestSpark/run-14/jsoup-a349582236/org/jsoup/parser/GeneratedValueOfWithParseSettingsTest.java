package org.jsoup.parser;

public class GeneratedValueOfWithParseSettingsTest {

    private static final String TAG_NAME = "div";
    private static final Tag tag = new Tag(TAG_NAME);
    private static final ParseSettings parseSettings = Mockito.mock(ParseSettings.class);

    @Test
    public void valueOfWithParseSettingsTest() {
        assertEquals(TAG_NAME, Tag.valueOf(TAG_NAME, parseSettings).getName());
    }

}