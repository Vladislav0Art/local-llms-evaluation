package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void getName_EmptyTag_ReturnsEmptyString() {
        Tag tag = new Tag();
        assertEquals("", tag.getName());
    }

    @Test
    public void getName_NonEmptyTag_ReturnsTagName() {
        Tag tag = new Tag();
        tag.setName("tag");
        assertEquals("tag", tag.getName());
    }

    @Test
    public void normalName_AmendedTag_ReturnsNormalizedName() {
        Tag tag = new Tag();
        tag.setName("amended");
        assertEquals("amended", tag.normalName());
    }

    @Test
    public void isBlock_DivTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void isBlock_PTag_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setName("p");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlock_DivTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("div");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInline_PTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("p");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmpty_EmptyTag_ReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosing_SelfClosingTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTag_KnownTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("tag");
        assertTrue(Tag.isKnownTag(tag.getName()));
    }

    @Test
    public void preserveWhitespace_DivTag_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setName("div");
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void setSelfClosing_SettingReturnsTrue() {
        Tag tag = new Tag();
        assertTrue(tag.setSelfClosing());
    }

    @Test
    public void isFormListed_FormTag_ReturnsFalse() {
        Tag tag = new Tag();
        tag.setName("form");
        assertFalse(tag.isFormListed());
    }

    @Test
    public void isFormSubmittable_FormTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("input");
        assertTrue(tag.isFormSubmittable());
    }

}