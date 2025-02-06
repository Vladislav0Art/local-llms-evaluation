package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.lang.Cloneable;

public class GeneratedTest {

    @Test
    public void getName_ReturnsName() {
        Tag tag = new Tag();
        String name = "test";
        tag.setName(name);
        assertEquals(name, tag.getName());
    }

    @Test
    public void normalName_ReturnsNormalName() {
        Tag tag = new Tag();
        String normalName = "test";
        tag.setNormalName(normalName);
        assertEquals(normalName, tag.normalName());
    }

    @Test
    public void valueOf_ReturnsValue() {
        String tagName = "test";
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Tag result = Tag.valueOf(tagName, settings);
        assertNotNull(result);
    }

    @Test
    public void valueOf_EmptyString_ThrowsNullPointerException() {
        String tagName = "";
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        assertTrue(Validate.throwsNullPointerException(() -> Tag.valueOf(tagName, settings)));
    }

    @Test
    public void isBlock_ReturnsTrueForBlockTags() {
        Tag tag = new Tag();
        tag.setName("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void isInline_ReturnsFalseForNonInlineTags() {
        Tag tag = new Tag();
        tag.setName("p");
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmpty_ReturnsTrueForEmptyTags() {
        Tag tag = new Tag();
        tag.setName("");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosing_ReturnsFalse() {
        Tag tag = new Tag();
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void setSelfClosing_ReturnsTag() {
        Tag tag = new Tag();
        tag.setSelfClosing();
        return tag;
    }

    @Test
    public void clone_ReturnsClone() {
        Tag tag = new Tag();
        Tag cloned = tag.clone();
        assertNotSame(tag, cloned);
        assertEquals(1L, cloned.hashCode());
    }

}