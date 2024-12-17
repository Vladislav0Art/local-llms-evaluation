package org.jsoup.parser;

public class GeneratedGetTagByName_KnownTag_ReturnsTag {

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
    public void getTagByName_KnownTag_ReturnsTag() {
        String tagName = "p";
        Tag tag = Tag.of(tagName);
        assertNotNull(tag);
        assertEquals(tagName, tag.getName());
    }

}