package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("p");
        assertEquals("p", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("P");
        assertEquals("p", tag.normalName());
    }

    @Test
    public void valueOfCaseSensitiveTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void valueOfCaseInsensitiveTest() {
        ParseSettings parseSettings = ParseSettings.htmlDefault;
        Tag tag = Tag.valueOf("P", parseSettings);
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("p");
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
    public void isKnownTagInstanceTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagNameTest() {
        assertTrue(Tag.isKnownTag("p"));
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = Tag.valueOf("pre");
        assertTrue(tag.preserveWhitespace());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormListed());

        Tag tagNotListed = Tag.valueOf("div");
        assertFalse(tagNotListed.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());

        Tag tagNotSubmittable = Tag.valueOf("div");
        assertFalse(tagNotSubmittable.isFormSubmittable());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        assertTrue(tag1.equals(tag2));

        Tag tag3 = Tag.valueOf("div");
        assertFalse(tag1.equals(tag3));
    }

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("p");
        int expectedHashCode = tag.hashCode();
        assertEquals(expectedHashCode, tag.hashCode());
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.toString());
    }

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("p");
        Tag clonedTag = tag.clone();
        assertNotSame(tag, clonedTag);
        assertEquals(tag, clonedTag);
    }

}