package org.jsoup.parser;

public class GeneratedValueOf_WithSpaces_ReturnsCorrectTagname {

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
    public void valueOf_WithSpaces_ReturnsCorrectTagname() {
        String tagName = " test   tag";
        parseSettings.setTagName(tagName);
        org.jsoup.parser.Tag tag = Tag.valueOf(tagName, parseSettings);
        org.junit.Assert.assertEquals("test-tag", tag.getName());
    }

}