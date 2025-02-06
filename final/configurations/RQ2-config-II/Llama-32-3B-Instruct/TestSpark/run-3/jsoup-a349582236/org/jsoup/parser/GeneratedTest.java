package org.jsoup.parser;

public class GeneratedTest {

    @Test
    public void getName_EmptyTagNameReturnsEmptyString() {
        assertEquals("", Tag.valueOf("").getName());
    }

    @Test
    public void getName_NonEmptyTagNameReturnsName() {
        assertEquals("div", Tag.valueOf("div").getName());
    }

    @Test
    public void normalName_WhitespacePresentInTagName_RestoresTagsOriginalName() {
        // Arrange
        String tagName = "   div   ";
        ParseSettings settings = new ParseSettings();

        // Act
        String normalName = Tag.valueOf(tagName, settings).normalName();
        assertEquals("div", normalName);
    }

    @Test
    public void isBlock_InlineTagsReturnsFalse() {
        assertTrue(Tag.valueOf("span").isBlock());
        assertFalse(Tag.valueOf("a").isBlock());
    }

    @Test
    public void formatAsBlock_InlineTagsReturnsTrue() {
        assertTrue(Tag.valueOf("img").formatAsBlock());
        assertFalse(Tag.valueOf("div").formatAsBlock());
    }

    @Test
    public void isInline_BlockTagsReturnsFalse() {
        assertTrue(Tag.valueOf("<br>").isInline());
        assertFalse(Tag.valueOf("<p>").isInline());
    }

    @Test
    public void isEmpty_EmptyTagNameReturnsTrue() {
        assertTrue(Tag.valueOf("").isEmpty());
    }

    @Test
    public void isEmpty_NonEmptyTagNameReturnsFalse() {
        assertFalse(Tag.valueOf("div").isEmpty());
    }

    @Test
    public void isSelfClosing_SelfClosingTagsReturnsTrue() {
        Tag selfClosingTag = Tag.valueOf("<img src='image.jpg'>");
        assertTrue(selfClosingTag.isSelfClosing());
    }

    @Test
    public void setSelfClosing_CannotSetSelfClosing() {
        // Arrange
        Tag tag = new Tag();
        ParseSettings settings = new ParseSettings();

        // Act and Assert
        assertThrows(IllegalStateException.class, () -> tag.setSelfClosing());
    }

    @Test
    public void isKnownTag_KnownTagsReturnsTrue() {
        assertTrue(Tag.isKnownTag("img"));
    }

    @Test
    public void isKnownTag_UnknownTagsReturnsFalse() {
        assertFalse(Tag.isKnownTag("unknown"));
    }

    @Test
    public void preserveWhitespace_PreserveWhitespaceReturnsTrue() {
        assertTrue(Tag.valueOf("<div>   </div>").preserveWhitespace());
    }

    @Test
    public void isFormListed_FormListedTagsReturnsTrue() {
        Tag formListedTag = Tag.valueOf("<form><input type='text'></form>");
        assertTrue(formListedTag.isFormListed());
    }

    @Test
    public void isFormSubmittable_FormSubmittableTagsReturnsFalse() {
        Tag formSubmittableTag = Tag.valueOf("<form id='test-form'><button>Submit</button></form>");
        assertFalse(formSubmittableTag.isFormSubmittable());
    }

}