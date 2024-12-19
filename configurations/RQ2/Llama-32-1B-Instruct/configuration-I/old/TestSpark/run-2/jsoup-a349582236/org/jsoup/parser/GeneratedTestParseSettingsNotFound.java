package org.jsoup.parser;

public class GeneratedTestParseSettingsNotFound {

    public static final String DEFAULT_SETTINGS = "default settings";

    public static Tag parseSettings() {
        return new TestTag(DEFAULT_SETTINGS);
    }
}

class TagParserTest {

    @Test
    public void testParseSettingsNotFound() {
        ParseSettings parseSettings = ParseSettings.parseSettings();
        try {
            Tag tag = new TestTag("test");
            parseSettings.parseSettings();
        } catch (Exception e) {
            // Expect exception to be thrown
        }
        Assert.assertNotNull(tag);
    }

    public void testCreateTestTag(String value, ParseSettings parseSettings) {
        Tag tag = new TestTag(value, parseSettings);
        Assert.assertNotNull(tag);
    }

}