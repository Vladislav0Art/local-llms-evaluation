package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameDefaultTagTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

    @Test
    public void getNameCaseSensitiveTagTest() {
        Tag tag = Tag.valueOf("P", ParseSettings.preserveCase);
        assertEquals("P", tag.getName());
    }

    @Test
    public void normalNameDefaultTagTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.normalName());
    }

    @Test
    public void normalNameCaseSensitiveTagTest() {
        Tag tag = Tag.valueOf("P", ParseSettings.preserveCase);
        assertEquals("p", tag.normalName());
    }

    @Test
    public void valueOfKnownTagTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void valueOfUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown");
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void isKnownTagTest() {
        assertTrue(Tag.isKnownTag("p"));
        assertFalse(Tag.isKnownTag("unknown"));
    }

    @Test
    public void isBlockTest() {
        assertTrue(Tag.valueOf("p").isBlock());
        assertFalse(Tag.valueOf("img").isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        assertTrue(Tag.valueOf("p").formatAsBlock());
        assertFalse(Tag.valueOf("img").formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        assertTrue(Tag.valueOf("img").isInline());
        assertFalse(Tag.valueOf("p").isInline());
    }

    @Test
    public void isEmptyTest() {
        assertTrue(Tag.valueOf("img").isEmpty());
        assertFalse(Tag.valueOf("p").isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        assertTrue(Tag.valueOf("img").isSelfClosing());
        assertFalse(Tag.valueOf("p").isSelfClosing());
    }

    @Test
    public void preserveWhitespaceTest() {
        assertTrue(Tag.valueOf("pre").preserveWhitespace());
        assertFalse(Tag.valueOf("p").preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        assertTrue(Tag.valueOf("input").isFormListed());
        assertFalse(Tag.valueOf("p").isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        assertTrue(Tag.valueOf("input").isFormSubmittable());
        assertFalse(Tag.valueOf("p").isFormSubmittable());
    }

    @Test
    public void equalsTest() {
        Tag tag = Tag.valueOf("p");
        Tag otherTag = tag.clone();
        assertTrue(tag.equals(otherTag));
    }

    @Test
    public void nonEqualsTest() {
        Tag tag = Tag.valueOf("p");
        Tag otherTag = Tag.valueOf("img");
        assertFalse(tag.equals(otherTag));
    }

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("p");
        Tag otherTag = tag.equals(tag.clone());
        assertTrue(tag.equals(otherTag));
    }

}