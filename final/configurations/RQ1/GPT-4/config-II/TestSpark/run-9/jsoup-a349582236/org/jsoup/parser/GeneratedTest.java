package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameKnownTagTest() {
        Tag tag = Tag.valueOf("body");
        assertEquals("body", tag.getName());
    }

    @Test
    public void getNameUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown");
        assertEquals("unknown", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("BODY");
        assertEquals("body", tag.normalName());
    }

    @Test
    public void valueOfKnownTagTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void valueOfUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown");
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void isBlockForBlockTagTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.isBlock());
    }

    @Test
    public void isBlockForInlineTagTest() {
        Tag tag = Tag.valueOf("a");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("a");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyForEmptyTagTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isEmptyForNonEmptyTagTest() {
        Tag tag = Tag.valueOf("body");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingForEmptyTagTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isSelfClosingForNonEmptyTagTest() {
        Tag tag = Tag.valueOf("body");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagForUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown");
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void isFormListedForFormTagTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormListedForNonFormTagTest() {
        Tag tag = Tag.valueOf("body");
        assertFalse(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableForFormTagTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void isFormSubmittableForNonFormTagTest() {
        Tag tag = Tag.valueOf("body");
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void predictParseBehaviourNoCaseTest() {
        assertEquals(Tag.valueOf("body"), Tag.valueOf("BODY", ParseSettings.noCase));
        assertFalse(Tag.valueOf("BODY", ParseSettings.noCase).isBlock());
    }

}