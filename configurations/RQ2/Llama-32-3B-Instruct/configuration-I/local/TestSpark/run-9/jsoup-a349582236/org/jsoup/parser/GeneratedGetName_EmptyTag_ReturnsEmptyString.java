package org.jsoup.parser;

public class GeneratedGetName_EmptyTag_ReturnsEmptyString {

    private String tagName;
    private boolean isBlock;

    public static Tag of(String tagName) {
        return new Tag(tagName);
    }

    public String getName() {
        return tagName;
    }

    public boolean isBlock() {
        return isBlock;
    }

    public void setIsBlock(boolean isBlock) {
        this.isBlock = isBlock;
    }
}

public class TestTag {

    @Test
    public void getName_EmptyTag_ReturnsEmptyString() {
        Tag tag = Tag.of("");
        assertEquals("", tag.getName());
    }

}