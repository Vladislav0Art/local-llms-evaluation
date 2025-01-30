package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag lowercaseTag = Tag.valueOf("div");
        assertEquals("div", lowercaseTag.normalName());

        Tag uppercaseTag = Tag.valueOf("DIV", ParseSettings.preserveCase);
        assertEquals("div", uppercaseTag.normalName());
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());

        Tag tagWithSettings = Tag.valueOf("DIV", ParseSettings.preserveCase);
        assertEquals("DIV", tagWithSettings.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());

        Tag inlineTag = Tag.valueOf("span");
        assertFalse(inlineTag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.formatAsBlock());

        Tag inlineTag = Tag.valueOf("span");
        assertFalse(inlineTag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("div");
        assertFalse(tag.isInline());

        Tag inlineTag = Tag.valueOf("span");
        assertTrue(inlineTag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());

        Tag notEmptyTag = Tag.valueOf("div");
        assertFalse(notEmptyTag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());

        Tag notSelfClosingTag = Tag.valueOf("div");
        assertFalse(notSelfClosingTag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        assertTrue(Tag.isKnownTag("div"));
        assertFalse(Tag.isKnownTag("notKnownTag"));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = Tag.valueOf("pre");
        assertTrue(tag.preserveWhitespace());

        Tag notWhitespaceTag = Tag.valueOf("div");
        assertFalse(notWhitespaceTag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormListed());

        Tag notListedTag = Tag.valueOf("div");
        assertFalse(notListedTag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());

        Tag notSubmittableTag = Tag.valueOf("div");
        assertFalse(notSubmittableTag.isFormSubmittable());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        assertTrue(tag1.equals(tag2));

        Tag tag3 = Tag.valueOf("span");
        assertFalse(tag1.equals(tag3));
    }

    @Test
    public void hashCodeTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.toString());
    }

}