package org.jsoup.parser;

public class GeneratedTest {

    private String tagName;
    private String attributeName;
    private String value;

    public Tag(String tagName, String attributeName, String value) {
        this.tagName = tagName;
        this.attributeName = attributeName;
        this.value = value;
    }

    public String getTagName() {
        return tagName;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public String getValue() {
        return value;
    }

    public boolean formatAsBlock() {
        return true;
    }

    public boolean isInline() {
        return true;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean setSelfClosing() {
        return true;
    }
}

public class TagTest {

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() {
        String tagName = "";
        assertEquals("", Tag.valueOf(tagName).getName());
    }

    @Test
    public void normalName_HtmlTagName_ReturnsOriginalName() {
        String tagName = "html";
        assertEquals(tagName, Tag.valueOf(tagName).normalName());
    }

    @Test
    public void normalName_NonHtmlTagName_ReturnsNormalizedName() {
        String tagName = "div";
        assertEquals("div", Tag.valueOf(tagName).normalName());
    }

    @Test
    public void valueOf_ExistingTagName_ReturnsTagInstance() {
        String tagName = "a";
        Tag tag = Tag.valueOf(tagName);
        assertNotNull(tag);
    }

    @Test
    public void valueOf_DuplicateTagName_ReturnsSameTagInstance() {
        String tagName = "span";
        Tag firstTag = Tag.valueOf(tagName);
        Tag secondTag = Tag.valueOf(tagName);
        assertEquals(firstTag, secondTag);
    }

    @Test
    public void isBlock_FormTagIsFalse() {
        String tagName = "a";
        assertFalse(Tag.valueOf(tagName).isBlock());
    }

    @Test
    public void isBlock_BlockTagIsTrue() {
        String tagName = "p";
        assertTrue(Tag.valueOf(tagName).isBlock());
    }

    @Test
    public void formatAsBlock_FormTagsAreFalseByDefault() {
        String tagName = "a";
        assertFalse(Tag.valueOf(tagName).formatAsBlock());
    }

    @Test
    public void formatAsBlock_BlockTagsAreTrueByDefault() {
        String tagName = "p";
        assertTrue(Tag.valueOf(tagName).formatAsBlock());
    }

    @Test
    public void isInline_FormTagsAreFalse() {
        String tagName = "span";
        assertFalse(Tag.valueOf(tagName).isInline());
    }

    @Test
    public void isEmpty_NoEmptyTagInstance() {
        String tagName = "div";
        assertFalse(Tag.valueOf(tagName).isEmpty());
    }

    @Test
    public void isEmpty_EmptyTagName_ReturnsTrue() {
        String tagName = "";
        assertTrue(Tag.valueOf(tagName).isEmpty());
    }

    @Test
    public void isSelfClosing_SelfClosingTagsAreTrue() {
        String tagName = "img";
        assertTrue(Tag.valueOf(tagName).isSelfClosing());
    }

    @Test
    public void isKnownTag_KnownTagsReturnTrue() {
        String tagName = "p";
        assertTrue(Tag.isKnownTag(tagName));
    }

    @Test
    public void preserveWhitespace_FormTagsPreserveWhitespaceByDefault() {
        String tagName = "span";
        assertTrue(Tag.valueOf(tagName).preserveWhitespace());
    }

    @Test
    public void isFormListed_FormTagsAreTrueByDefault() {
        String tagName = "input";
        assertTrue(Tag.valueOf(tagName).isFormListed());
    }

    @Test
    public void equals_DifferentTagInstancesReturnFalse() {
        String tagName1 = "div";
        String tagName2 = "span";
        assertFalse(Tag.valueOf(tagName1).equals(Tag.valueOf(tagName2)));
    }

    @Test
    public void equals_SameTagInstance_ReturnsTrue() {
        String tagName = "p";
        Tag tag1 = Tag.valueOf(tagName);
        Tag tag2 = Tag.valueOf(tagName);
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCode_DifferentTagInstancesReturnDifferentHashCodes() {
        String tagName1 = "div";
        String tagName2 = "span";
        int hash1 = Tag.valueOf(tagName1).hashCode();
        int hash2 = Tag.valueOf(tagName2).hashCode();
        assertNotEquals(hash1, hash2);
    }

}