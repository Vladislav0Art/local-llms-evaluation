package org.jsoup.parser;

public class GeneratedCreateBlock {

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
    public void createBlock() {
        Tag tag = Tag.of("div");
        tag.setIsBlock(true);
        assertTrue(tag.isBlock());
    }

}