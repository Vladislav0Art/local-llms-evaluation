package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedTest {

    @Test
    public void getNameValidTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

    @Test
    public void normalNameValidTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("p", tag.normalName());
    }

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("div", ParseSettings.htmlDefault);
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void valueOfWithoutSettingsTest() {
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isBlockTrueTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void isBlockFalseTest() {
        Tag tag = Tag.valueOf("span");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTrueTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void formatAsBlockFalseTest() {
        Tag tag = Tag.valueOf("span");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTrueTest() {
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

    @Test
    public void isInlineFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTrueTest() {
        Tag tag = Tag.valueOf("area");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isEmptyFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTrueTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isSelfClosingFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTrueTest() {
        assertTrue(Tag.isKnownTag("div"));
    }

    @Test
    public void isKnownTagFalseTest() {
        assertFalse(Tag.isKnownTag("unknownTag"));
    }

    @Test
    public void preserveWhitespaceTrueTest() {
        Tag tag = Tag.valueOf("pre");
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void preserveWhitespaceFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTrueTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormListedFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTrueTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void isFormSubmittableFalseTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void equalsTrueTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void equalsFalseTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("div");
        assertFalse(tag1.equals(tag2));
    }

    @Test
    public void hashCodeValidTest() {
        Tag tag = Tag.valueOf("p");
        assertNotNull(tag.hashCode());
    }

    @Test
    public void toStringValidTest() {
        Tag tag = Tag.valueOf("p");
        assertNotNull(tag.toString());
    }

    @Test
    public void cloneValidTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = tag1.clone();
        assertEquals(tag1, tag2);
    }

}