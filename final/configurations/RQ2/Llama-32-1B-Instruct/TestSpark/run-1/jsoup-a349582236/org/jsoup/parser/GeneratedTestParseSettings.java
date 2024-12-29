package org.jsoup.parser;

public class GeneratedTestParseSettings {

    @Test
    public void testParseSettings() {
        String tagName = "tag";
        ParseSettings settings = new ParseSettings();
        settings.put(ParseSettings.FORMED, false);
        Tag valueOfTag = Tag.valueOf(tagName, settings);
        assertNotEquals(valueOfTag, tags.get(tagName));
    }
}

class TagImpl extends AbstractTagTest {

    public String getName() {
        return name;
    }

    @Override
    protected void setUp() {
        super.setUp();
        tags.put("tag", this);
    }

}