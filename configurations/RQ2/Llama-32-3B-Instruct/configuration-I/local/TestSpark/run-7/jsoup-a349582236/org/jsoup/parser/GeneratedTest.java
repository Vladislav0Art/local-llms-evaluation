package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void getName_EmptyTag_ReturnsEmptyString() {
        Tag tag = new Tag();
        assertEquals("", tag.getName());
    }

    @Test
    public void getName_ValidTag_ReturnsTagName() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void normalName_EmptyTag_ReturnsEmptyString() {
        Tag tag = new Tag();
        assertEquals("", tag.normalName());
    }

    @Test
    public void normalName_ValidTag_ReturnsLowerCasedTagName() {
        Tag tag = new Tag("Div");
        assertEquals("div", tag.normalName());
    }

    @Test
    public void valueOf_EmptyString_ReturnsNewGenericTag() {
        Tag actual = Tag.valueOf("", null);
        assertNotNull(actual);
        assertTrue(actual.isEmpty());
    }

    @Test
    public void valueOf_ValidTagName_ReturnsPredefinedTag() {
        Tag actual = Tag.valueOf("div", null);
        assertNotNull(actual);
        assertFalse(actual.isEmpty());
        assertEquals("div", actual.getName());
    }

    @Test
    public void isBlock_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

    @Test
    public void isBlock_ValidBlockTag_ReturnsTrue() {
        Tag tag = new Tag("p");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlock_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void formatAsBlock_ValidBlockTag_ReturnsTrue() {
        Tag tag = new Tag("p");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInline_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isInline());
    }

    @Test
    public void isInline_ValidInlineTag_ReturnsTrue() {
        Tag tag = new Tag("span");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmpty_EmptyTag_ReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isEmpty_ValidTag_ReturnsFalse() {
        Tag tag = new Tag("div");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosing_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isSelfClosing_ValidSelfClosingTag_ReturnsTrue() {
        Tag tag = new Tag("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTag_EmptyString_ReturnsFalse() {
        assertFalse(Tag.isKnownTag(""));
    }

    @Test
    public void isKnownTag_ValidTagName_ReturnsTrue() {
        assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void preserveWhitespace_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void preserveWhitespace_ValidTag_ReturnsFalse() {
        Tag tag = new Tag("span");
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void isFormListed_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isFormListed());
    }

    @Test
    public void isFormSubmittable_EmptyTag_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void isFormListed_ValidFormlistedTag_ReturnsTrue() {
        Tag tag = new Tag("input");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittable_ValidFormsSubmittableTag_ReturnsTrue() {
        Tag tag = new Tag("textarea");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void setSelfClosing_EmptyTag_ReturnsEmptyTag() {
        Tag actual = Tag.valueOf("", null);
        Tag result = actual.setSelfClosing();
        assertEquals(actual, result);
    }

    @Test
    public void setSelfClosing_ValidTag_ReturnsTagWithSelfClosing() {
        Tag tag = new Tag("img");
        Tag result = tag.setSelfClosing();
        assertTrue(result.isSelfClosing());
    }

}