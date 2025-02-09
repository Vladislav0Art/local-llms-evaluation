package org.jsoup.parser;

public class GeneratedFormatAsBlock_WhenTagnameIsNotDiv_ReturnsFalse {

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
    public void formatAsBlock_WhenTagnameIsNotDiv_ReturnsFalse() {
        String tagName = "p";
        parseSettings.setTagName(tagName);
        org.jsoup.parser.Tag tag = Tag.valueOf(tagName, parseSettings);
        org.junit.Assert.assertFalse(tag.formatAsBlock());
    }

}