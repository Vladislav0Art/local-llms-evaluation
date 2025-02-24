package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("tag");
        assertEquals("tag", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("tag");
        assertEquals("tag", tag.normalName());
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("tag");
        assertEquals("tag", tag.getName());
    }

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings settings = mock(ParseSettings.class);
        Tag tag = Tag.valueOf("tag", settings);
        assertEquals("tag", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("tag");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("tag");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("tag");
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("tag");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("tag");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = new Tag("tag");
        assertFalse(tag.isKnownTag());
    }

}