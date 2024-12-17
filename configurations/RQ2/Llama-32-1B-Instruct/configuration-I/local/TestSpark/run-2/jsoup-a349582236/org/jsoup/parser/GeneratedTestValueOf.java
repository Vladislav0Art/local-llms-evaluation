package org.jsoup.parser;

public class GeneratedTestValueOf {

    public static final String DEFAULT_SETTINGS = "default settings";

    public static Tag parseSettings() {
        return new TestTag(DEFAULT_SETTINGS);
    }
}

class TagParserTest {

    @Test
    public void testValueOf() {
        TestTag tag = new TestTag("test");
        Assert.assertNotNull(tag);
    }

}