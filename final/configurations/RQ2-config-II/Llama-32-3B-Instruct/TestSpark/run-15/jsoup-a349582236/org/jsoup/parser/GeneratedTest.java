package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void getName_ValidName_ReturnsName() {
        String name = "div";
        Tag tag = new Tag(name);
        assertEquals(name, tag.getName());
    }

    @Test
    public void getName_InvalidName

    ThrowsIllegalArgumentException() {
        Validate.assertThat(() -> new Tag("div"), Throws.instanceOf(IllegalArgumentException.class));
    }

    @Test
    public void normalName_ValidName_ReturnsNormalizedName() {
        String name = "div";
        Tag tag = new Tag(name);
        assertEquals(Normalizer.normalName(name), tag.normalName());
    }

    @Test
    public void valueOf_ValidName_ReturnsTagInstance() {
        String name = "img";
        ParseSettings settings = new ParseSettings();
        Tag expectedTag = new Tag("img");
        assertTrue(Tag.valueOf(name, settings) == expectedTag);
    }

    @Test
    public void valueOf_InvalidName_ThrowsIllegalArgumentException() {
        Validate.assertThat(() -> Tag.valueOf("img", null), Throws.instanceOf(IllegalArgumentException.class));
    }

    @Test
    public void isBlock_ValidTag_ReturnsTrue() {
        String name = "p";
        Tag tag = new Tag(name);
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlock_ValidTag_ReturnsFalse() {
        String name = "span";
        Tag tag = new Tag(name);
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInline_ValidTag_ReturnsTrue() {
        String name = "img";
        Tag tag = new Tag(name);
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmpty_ValidTag_ReturnsFalse() {
        String name = "div";
        Tag tag = new Tag(name);
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosing_ValidTag_ReturnsTrue() {
        String name = "img";
        Tag tag = new Tag(name);
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void setSelfClosing_ValidName_SetterselfClosing() {
        String name = "img";
        Tag tagBefore = new Tag(name);
        boolean selfClosingBefore = tagBefore.isSelfClosing();
        Tag tagAfter = tagBefore.setSelfClosing();
        assertTrue(tagAfter.isSelfClosing());
    }

    @Test
    public void isKnownTag_ValidName_ReturnsTrue() {
        String name = "img";
        assertTrue(Tag.isKnownTag(name));
    }

    @Test
    public void equals_TagInstancesWithSameAttributesEquals() {
        Tag tag1 = new Tag("div");
        Tag tag2 = new Tag("div");
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCode_TagInstancesWithSameAttributesHaveSameHashcode() {
        Tag tag1 = new Tag("div");
        Tag tag2 = new Tag("div");
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}