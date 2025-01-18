package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("a");
        assertEquals("a", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("A");
        assertEquals("a", tag.normalName());
    }

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("DIV", ParseSettings.htmlDefault);
        assertTrue(tag.isBlock());
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("a");
        assertTrue(tag.isInline());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("DIV");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("DIV");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("a");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTrueTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagFalseTest() {
        Tag tag = Tag.valueOf("xyz");
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void isKnownTagNameTest() {
        assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = Tag.valueOf("pre");
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void setSelfClosingTest() {
        Tag tag = Tag.valueOf("div");
        tag = tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals(tag.hashCode(), Tag.valueOf("div").hashCode());
    }

    @Test
    public void cloneTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = tag1.clone();
        assertNotNull(tag2);
        assertEquals(tag1, tag2);
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.toString());
    }

}