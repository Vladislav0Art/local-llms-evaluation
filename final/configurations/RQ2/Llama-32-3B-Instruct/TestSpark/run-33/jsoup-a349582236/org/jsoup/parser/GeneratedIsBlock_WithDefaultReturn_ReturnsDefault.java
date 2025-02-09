package org.jsoup.parser;

public class GeneratedIsBlock_WithDefaultReturn_ReturnsDefault {

    private String tagName;

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}

public class TagTest {

    @Mock
    private ParseSettings parseSettings;

    @Before
    public void setup() {
        parseSettings.setTagName("");
    }

    @Test
    public void isBlock_WithDefaultReturn_ReturnsDefault() {
        String tagName = "div";
        parseSettings.setTagName(tagName);
        org.jsoup.parser.Tag tag = Tag.valueOf(tagName, parseSettings);
        org.junit.Assert.assertTrue(tag.isBlock());
    }

}