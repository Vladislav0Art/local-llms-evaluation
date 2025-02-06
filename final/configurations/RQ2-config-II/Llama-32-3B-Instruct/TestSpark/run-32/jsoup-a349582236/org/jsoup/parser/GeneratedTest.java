package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void getName_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().getName());
    }

    @Test
    public void getName_EmptyTagName_ReturnsEmptyString() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertEquals("", tag.getName());
    }

    @Test
    public void getName_SimpleTagName_ReturnsTagName() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertEquals("div", tag.getName());
    }

    @Test
    public void normalName_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().normalName());
    }

    @Test
    public void normalName_EmptyTagName_ReturnsEmptyString() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertEquals("", tag.normalName());
    }

    @Test
    public void valueOf_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> Tag.valueOf(null));
    }

    @Test
    public void valueOf_SimpleTagName_ReturnsTagInstance() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertNotNull(tag);
    }

    @Test
    public void isBlock_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().isBlock());
    }

    @Test
    public void isBlock_EmptyTagName_ReturnsFalse() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isBlock());
    }

    @Test
    public void isInline_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().isInline());
    }

    @Test
    public void isInline_SimpleTagName_ReturnsFalse() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmpty_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().isEmpty());
    }

    @Test
    public void isEmpty_EmptyTagName_ReturnsTrue() {
        String tagName = "";
        Tag tag = Tag.valueOf(tagName);
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosing_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().isSelfClosing());
    }

    @Test
    public void isSelfClosing_SimpleTagName_ReturnsFalse() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTag_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> Tag.isKnownTag(null));
    }

    @Test
    public void isKnownTag_EmptyTagName_ReturnsFalse() {
        String tagName = "";
        assertFalse(Tag.isKnownTag(tagName));
    }

    @Test
    public void isFormListed_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().isFormListed());
    }

    @Test
    public void isFormSubmittable_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().isFormSubmittable());
    }

    @Test
    public void setSelfClosing_NullTagName_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().setSelfClosing());
    }

    @Test
    public void equals_NullTag_ReturnsFalse() {
        Tag tag1 = new Tag();
        Tag tag2 = null;
        assertFalse(tag1.equals(tag2));
    }

    @Test
    public void equals_SelfClosingTag_ReturnsTrue() {
        String tagName = "img";
        Tag tag1 = Tag.valueOf(tagName);
        Tag tag2 = Tag.valueOf(tagName);
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCode_NullTag_ReturnsZero() {
        Tag tag1 = new Tag();
        Tag tag2 = null;
        assertEquals(0, tag1.hashCode());
    }

    @Test
    public void toString_SimpleTagName_ReturnsTagName() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertNotNull(tag.toString());
    }

    @Test
    public void clone_NullTag_ThrowsNullPointerException() {
        org.junit.Assert.assertThrows(NullPointerException.class, () -> new Tag().clone());
    }

    @Test
    public void clone_SelfClosingTag_ReturnsSameTagInstance() {
        String tagName = "img";
        Tag tag1 = Tag.valueOf(tagName);
        Tag tag2 = tag1.clone();
        assertNotNull(tag2);
        assertEquals(tag1, tag2);
    }

}