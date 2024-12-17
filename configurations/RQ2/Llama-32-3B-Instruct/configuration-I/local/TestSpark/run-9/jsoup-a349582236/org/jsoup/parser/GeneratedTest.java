package org.jsoup.parser;

public class GeneratedTest {

    private String tagName;
    private boolean isBlock;

    public static Tag of(String tagName) {
        return new Tag(tagName);
    }

    public Tag() {
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
    public void getTagByName_KnownTag_ReturnsTag() {
        String tagName = "p";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag);
        assertEquals(tagName, tag.getName());
    }

    @Test
    public void getTagByName_UnknownTag_ReturnsGenericTag() {
        String tagName = "xyz";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag);
        assertTrue(!tag.equals(null));
    }

    @Test
    public void isBlock_BlockTag_ReturnsTrue() {
        String tagName = "p";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlock_BlockTag_ReturnsTrue() {
        String tagName = "p";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInline_InlineTag_ReturnsTrue() {
        String tagName = "span";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmpty_KnownTag_ReturnsFalse() {
        String tagName = "p";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosing_SelfClosingTag_ReturnsTrue() {
        String tagName = "img";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTag_KnownTag_ReturnsTrue() {
        String tagName = "p";
        ParseSettings settings = null;
        assertTrue(Tag.isKnownTag(tagName));
    }

    @Test
    public void isKnownTag_UnknownTag_ReturnsFalse() {
        String tagName = "xyz";
        ParseSettings settings = null;
        assertFalse(Tag.isKnownTag(tagName));
    }

    @Test
    public void preserveWhitespace_KnownTag_ReturnsFalse() {
        String tagName = "p";
        ParseSettings settings = null;
        assertFalse(Tag.valueOf(tagName, settings).preserveWhitespace());
    }

}