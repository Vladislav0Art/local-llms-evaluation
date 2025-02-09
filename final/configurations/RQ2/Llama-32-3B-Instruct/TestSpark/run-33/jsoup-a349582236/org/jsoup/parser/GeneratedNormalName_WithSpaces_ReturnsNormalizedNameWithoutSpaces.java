package org.jsoup.parser;

public class GeneratedNormalName_WithSpaces_ReturnsNormalizedNameWithoutSpaces {

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
    public void normalName_WithSpaces_ReturnsNormalizedNameWithoutSpaces() {
        String tagName = "test  tag";
        parseSettings.setTagName(tagName);
        org.jsoup.parser.Tag tag = Tag.valueOf(tagName, parseSettings);
        org.junit.Assert.assertEquals("test-tag", tag.normalName());
    }

}