package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameWhenTagNameIsGivenTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

    @Test
    public void normalNameWhenTagNameIsGivenTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("p", tag.normalName());
    }

    @Test
    public void valueOfWhenTagNameIsGivenTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

    @Test
    public void valueOfWhenTagNameWithParseSettingsIsGivenTest() {
        Tag tag = Tag.valueOf("P", ParseSettings.preserveCase);
        assertEquals("P", tag.getName());
    }

    @Test
    public void isBlockForBlockElementTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void isBlockForInlineElementTest() {
        Tag tag = Tag.valueOf("a");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockForBlockElementTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void formatAsBlockForInlineElementTest() {
        Tag tag = Tag.valueOf("a");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineForInlineElementTest() {
        Tag tag = Tag.valueOf("a");
        assertTrue(tag.isInline());
    }

    @Test
    public void isInlineForBlockElementTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyForEmptyElementTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isEmptyForNotEmptyElementTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingForEmptyElementTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isSelfClosingForNotSelfClosingElementTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagForUnknownTagTest() {
        Tag tag = Tag.valueOf("unknownTag");
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void isKnownTagNameForUnknownTagTest() {
        assertFalse(Tag.isKnownTag("unknownTag"));
    }

    @Test
    public void isKnownTagNameForKnownTagTest() {
        assertTrue(Tag.isKnownTag("p"));
    }

    @Test
    public void preserveWhitespaceWhenWhitespacesArePreservedTest() {
        Tag tag = Tag.valueOf("pre");
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedWhenTagFormListedTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormListedWhenTagNotFormListedTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableWhenTagFormSubmittableTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void isFormSubmittableWhenTagNotFormSubmittableTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isFormSubmittable());
    }

    @Test
    public void tagNameToStringTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.toString());
    }

}