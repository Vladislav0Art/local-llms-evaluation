package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getNameValidInputTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

    @Test
    public void normalNameValidInputTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("p", tag.normalName());
    }

    @Test
    public void valueOfNonDefaultSettingsTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.htmlDefault);
        assertTrue(tag.isBlock());
    }

    @Test
    public void valueOfWithTagNameTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void isBlockTrueTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTrueTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineFalseTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyFalseTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingFalseTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagValidTagNameTest() {
        assertTrue(Tag.isKnownTag("p"));
    }

    @Test
    public void preserveWhitespaceTrueTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedFalseTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableFalseTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void equalsSameObjectInstanceTest() {
        Tag tag = Tag.valueOf("p");
        Tag otherTag = Tag.valueOf("p");
        assertTrue(tag.equals(otherTag));
    }

    @Test
    public void equalsDifferentObjectInstanceTest() {
        Tag tag = Tag.valueOf("p");
        Tag otherTag = Tag.valueOf("div");
        assertFalse(tag.equals(otherTag));
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("<p>", tag.toString());
    }

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("p");
        Tag cloneTag = tag.clone();
        assertEquals(tag, cloneTag);
    }

}