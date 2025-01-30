package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameExistingTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertEquals("body", tag.getName());
    }

    @Test
    public void normalNameExistingTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertEquals("body", tag.normalName());
    }

    @Test
    public void valueOfTagNameSettingsTest() {
        Tag tag = Tag.valueOf("body", ParseSettings.htmlDefault);
        assertNotNull(tag);
    }

    @Test
    public void valueOfNullTagSettingsTest() {
        Tag.valueOf(null, ParseSettings.preserveCase);
    }

    @Test
    public void valueOfTagNameEmptySettingsTest() {
        Tag.valueOf("", ParseSettings.htmlDefault);
    }

    @Test
    public void valueOfTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertNotNull(tag);
    }

    @Test
    public void isBlockExistingTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockExistingTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineExistingTagNameTest() {
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyExistingTagNameTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingExistingTagNameTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagExistingTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagStaticUnknownTagNameTest() {
        assertFalse(Tag.isKnownTag("unknownTag"));
    }

    @Test
    public void isKnownTagStaticKnownTagNameTest() {
        assertTrue(Tag.isKnownTag("body"));
    }

    @Test
    public void isFormListedExistingTagNameTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableExistingTagNameTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void hashCodeExistingTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertEquals(tag.hashCode(), Tag.valueOf("body").hashCode());
    }

    @Test
    public void equalsSameTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.equals(Tag.valueOf("body")));
    }

    @Test
    public void equalsDifferentTagNameTest() {
        Tag tag = Tag.valueOf("body");
        assertFalse(tag.equals(Tag.valueOf("head")));
    }

}