package org.jsoup.parser;

public class GeneratedNormalName_EmptyTag_ReturnsEmptyString {

    private String name;
    private boolean selfClosing;

    public Tag(String name) {
        this.name = name;
    }

    // Other public methods...

    public static Tag of(String tagName, ParseSettings settings) {
        // Implementation...
        return new Tag(tagName);
    }
}

public class TestTag {

    @Test
    public void normalName_EmptyTag_ReturnsEmptyString() {
        Tag tag = Tag.of("");
        assertEquals("", tag.normalName());
    }

}