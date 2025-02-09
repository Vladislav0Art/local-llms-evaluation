package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTest {

    @Test
    public void getName_NonEmptyName_ReturnsTagName() {
        String tagName = "div";
        String expectedTagName = tagName;
        Tag tag = new Tag(tagName);
        assertEquals(expectedTagName, tag.getName());
    }

    @Test
    public void getName_EmptyName_ThrowsValidationException() {
        String tagName = "";
        Validate.validatethagetName(tagName);
        assertTrue(tagName.isEmpty());
    }

    @Test
    public void normalName_SelfClosingTag_ReturnsTagNameWithSlash() {
        String tagName = "img";
        Tag tag = new Tag(tagName);
        assertEquals(tagName + "/", tag.normalName());
    }

    @Test
    public void normalName_NonSelfClosingTag_ReturnsNormalizedTagName() {
        String tagName = "div";
        Normalizer normalizer = new Normalizer();
        Tag tag = new Tag(tagName);
        String expectedNormalizedName = normalizer.normalize(tagName);
        assertEquals(expectedNormalizedName, tag.normalName());
    }

    @Test
    public void valueOf_UnknownTag_ReturnsNull() {
        String tagName = "unknown";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        assertNull(tag);
    }

    @Test
    public void valueOf_KnownTag_ReturnsTagObject() {
        String tagName = "img";
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf(tagName, settings);
        assertNotNull(tag);
    }

    @Test
    public void isBlock_BlockTags_ReturnsTrue() {
        String tagName = "div";
        assertTrue(Tag.valueOf(tagName).isBlock());
    }

    @Test
    public void isBlock_NonBlockTags_ReturnsFalse() {
        String tagName = "span";
        assertFalse(Tag.valueOf(tagName).isBlock());
    }

    @Test
    public void formatAsBlock_BlockTags_ReturnsTrue() {
        String tagName = "div";
        assertTrue(Tag.valueOf(tagName).formatAsBlock());
    }

    @Test
    public void formatAsBlock_NonBlockTags_ReturnsFalse() {
        String tagName = "span";
        assertFalse(Tag.valueOf(tagName).formatAsBlock());
    }

    @Test
    public void isInline_InlineTags_ReturnsTrue() {
        String tagName = "img";
        assertTrue(Tag.valueOf(tagName).isInline());
    }

    @Test
    public void isInline_NonInlineTags_ReturnsFalse() {
        String tagName = "div";
        assertFalse(Tag.valueOf(tagName).isInline());
    }

    @Test
    public void isEmpty_EmptyTags_ReturnsTrue() {
        Tag tag = new Tag("");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isEmpty_NonEmptyTags_ReturnsFalse() {
        String tagName = "img";
        assertFalse(Tag.valueOf(tagName).isEmpty());
    }

    @Test
    public void isSelfClosing_SelfClosingTags_ReturnsTrue() {
        String tagName = "img";
        assertTrue(Tag.valueOf(tagName).isSelfClosing());
    }

    @Test
    public void isSelfClosing_NonSelfClosingTags_ReturnsFalse() {
        String tagName = "div";
        assertFalse(Tag.valueOf(tagName).isSelfClosing());
    }

    @Test
    public void setSelfClosing_SelfClosingTags_ReturnsTrue() {
        Tag tag = new Tag("img");
        assertTrue(tag.setSelfClosing());
    }

    @Test
    public void setSelfClosing_NonSelfClosingTags_ReturnsFalse() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        assertFalse(tag.setSelfClosing());
    }

    @Test
    public void equals_NullTag_ReturnsFalse() {
        Tag tag1 = new Tag("img");
        Tag tag2 = null;
        assertFalse(tag1.equals(tag2));
    }

    @Test
    public void equals_SameTags_ReturnsTrue() {
        String tagName = "img";
        Tag tag1 = new Tag(tagName);
        Tag tag2 = new Tag(tagName);
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCode_SameTags_ReturnsSameHashcode() {
        String tagName = "img";
        Tag tag1 = new Tag(tagName);
        Tag tag2 = new Tag(tagName);
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

    @Test
    public void clone_CloneTag_ReturnsNewTagObject() {
        String tagName = "div";
        Tag tag = new Tag(tagName);
        Tag clonedTag = (Tag) tag.clone();
        assertNotNull(clonedTag);
        assertEquals(tagName, clonedTag.getName());
    }

}