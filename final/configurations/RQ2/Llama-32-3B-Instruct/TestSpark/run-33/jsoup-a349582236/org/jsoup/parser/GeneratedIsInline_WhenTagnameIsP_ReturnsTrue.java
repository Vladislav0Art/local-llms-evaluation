package org.jsoup.parser;

public class GeneratedIsInline_WhenTagnameIsP_ReturnsTrue {

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
    public void isInline_WhenTagnameIsP_ReturnsTrue() {
        String tagName = "p";
        parseSettings.setTagName(tagName);
        org.jsoup.parser.Tag tag = Tag.valueOf(tagName, parseSettings);
        org.junit.Assert.assertTrue(tag.isInline());
    }
}

public class Tag {
    private boolean block;
    private String tagName;

    public Tag(boolean block) {
        this.block = block;
    }

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public String getName() {
        return tagName;
    }

    public boolean isBlock() {
        return block;
    }

    public boolean formatAsBlock() {
        return block;
    }

    public static org.jsoup.parser.Tag valueOf(String tagName, ParseSettings parseSettings) {
        if (tagName.equals("div")) {
            return new Tag(true);
        } else if (tagName.equals("p")) {
            return new Tag(false);
        }
        return null;
    }

    public boolean isInline() {
        return !isBlock();
    }

}