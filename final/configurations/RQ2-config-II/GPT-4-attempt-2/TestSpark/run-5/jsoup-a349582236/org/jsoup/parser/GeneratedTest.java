package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("DIV");
        assertEquals("div", tag.normalName());
    }

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings settings = new ParseSettings(true, false);
        Tag tag = Tag.valueOf("div", settings);
        assertNotNull(tag);
    }

    @Test
    public void valueOfWithoutSettingsTest() {
        Tag tag = Tag.valueOf("div");
        assertNotNull(tag);
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("!doctype");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagInstanceTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagStringTest() {
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
        Tag tag = Tag.valueOf("img").setSelfClosing();
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
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.toString());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = (Tag) tag1.clone();
        assertEquals(tag1, tag2);
    }

}