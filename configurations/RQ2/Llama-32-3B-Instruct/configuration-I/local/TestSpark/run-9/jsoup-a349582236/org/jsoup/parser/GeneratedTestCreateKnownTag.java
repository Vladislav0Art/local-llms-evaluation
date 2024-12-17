package org.jsoup.parser;

public class GeneratedTestCreateKnownTag {

    private String tagName;
    private boolean isBlock;

    public static Tag of(String tagName) {
        return new Tag(tagName);
    }

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    public String getName() {
        return tagName;
    }

    public void setIsBlock(boolean isBlock) {
        this.isBlock = isBlock;
    }

    public boolean isBlock() {
        return isBlock;
    }
}

public class TestTag {

    @Test
    public void testCreateKnownTag() {
        String tagName = "p";
        Tag tag = Tag.of(tagName);
        assertNotNull(tag);
        assertEquals(tagName, tag.getName());
    }

}