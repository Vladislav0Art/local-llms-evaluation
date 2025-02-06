package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void getName_EmptyName_ReturnsEmptyString() {
        String name = "";
        assertEquals("", Tag.valueOf(name).getName());
    }

    @Test
    public void getName_NonEmptyName_ReturnsName() {
        String name = "div";
        assertEquals("div", Tag.valueOf(name).getName());
    }

    @Test
    public void normalName_EmptyName_ReturnsEmptyString() {
        String name = "";
        assertEquals("", Tag.valueOf("").normalName());
    }

    @Test
    public void normalName_NonEmptyName_ReturnsNormalName() {
        String name = "div";
        assertEquals("div", Tag.valueOf(name).normalName());
    }

    @Test
    public void valueOf_EmptyName_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> Tag.valueOf(""));
    }

    @Test
    public void valueOf_NonEmptyName_ReturnsTag() {
        String name = "div";
        Tag tag = Tag.valueOf(name);
        assertNotNull(tag);
    }

    @Test
    public void isBlock_FragmentTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isBlock());
    }

    @Test
    public void isBlock_BlockTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlock_FragmentTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void formatAsBlock_BlockTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInline_FormTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("form");
        assertFalse(tag.isInline());
    }

    @Test
    public void isInline_InlineTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmpty_EmptyName_ReturnsTrue() {
        String name = "";
        Tag tag = Tag.valueOf(name);
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isEmpty_NonEmptyName_ReturnsFalse() {
        String name = "div";
        Tag tag = Tag.valueOf(name);
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosing_SelfClosingTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isSelfClosing_NonSelfClosingTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTag_EmptyName_ReturnsFalse() {
        String name = "";
        assertFalse(Tag.isKnownTag(name));
    }

    @Test
    public void isKnownTag_NonEmptyName_ReturnsTrue() {
        String name = "img";
        assertTrue(Tag.isKnownTag(name));
    }

    @Test
    public void preserveWhitespace_SelfClosingTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("img");
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void preserveWhitespace_BlockTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListed_FormTag_ReturnsFalse() {
        Tag tag = Tag.valueOf("form");
        assertFalse(tag.isFormListed());
    }

    @Test
    public void isFormSubmittable_SubmitTag_ReturnsTrue() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void setSelfClosing_SelfClosingTag_ReturnsTrue() {
        String name = "img";
        Tag tag = Tag.valueOf(name);
        assertTrue(tag.setSelfClosing());
    }

    @Test
    public void setSelfClosing_BlockTag_ReturnsFalse() {
        stringName = "div";
        Tag tag = Tag.valueOf(stringName);
        assertFalse(tag.setSelfClosing());
    }

}