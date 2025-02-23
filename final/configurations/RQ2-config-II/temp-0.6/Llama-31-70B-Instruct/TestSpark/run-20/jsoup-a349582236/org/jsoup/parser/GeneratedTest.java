package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void isBlockTagTest() {
        Tag tag = new Tag("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void isInlineTagTest() {
        Tag tag = new Tag("span");
        assertFalse(tag.isBlock());
    }

    @Test
    public void isEmptyTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = new Tag("div");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void preserveWhitespaceTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTagTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isFormSubmittable());
    }

}