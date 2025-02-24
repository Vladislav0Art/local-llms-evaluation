package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Tag;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("div");
        assertEquals("div", tag.normalName());
    }

    @Test
    public void valueOfTest() {
        ParseSettings settings = new ParseSettings(false, false);
        Tag tag = Tag.valueOf("div", settings);
        assertNotNull(tag);
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void isKnownTagStaticTest() {
        assertFalse(Tag.isKnownTag("div"));
    }

}