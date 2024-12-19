package org.jsoup.parser;

public class GeneratedTestValueOfNotFound {

    public static final String DEFAULT_SETTINGS = "default settings";

    public static Tag parseSettings() {
        return new TestTag(DEFAULT_SETTINGS);
    }
}

class TagParserTest {

    @Test
    public void testValueOfNotFound() {
        try {
            ParseSettings.parseSettings();
        } catch (Exception e) {
            // Expect exception to be thrown
        }
        Tag tag = new Tag(valueOf("test", ParseSettings.parseSettings()));
        Assert.assertNotNull(tag);
    }

    public void testParseSettingsSuccess() {
        Tag tag = new TestTag("test");
        ParseSettings parseSettings = ParseSettings.parseSettings();
        tag = new Tag(valueOf("test", parseSettings));
        Assert.assertNotNull(tag);
    }

}