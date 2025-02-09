package org.jsoup.parser;

public class GeneratedGetName_EmptyTagName_ReturnsEmptyString {

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
    public void getName_EmptyTagName_ReturnsEmptyString() {
        org.junit.Assert.assertEquals("", Tag.valueOf(parseSettings.getTagName(), parseSettings).getName());
    }

}