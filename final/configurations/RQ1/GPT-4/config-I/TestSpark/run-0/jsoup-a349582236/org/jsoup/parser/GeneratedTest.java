package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("test");
        assertEquals("test", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("TEST");
        assertEquals("test", tag.normalName());
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("p");
        Tag anotherTag = Tag.valueOf("p", ParseSettings.preserveCase);
        assertEquals(tag, anotherTag);
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("meta");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("head");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        assertTrue(Tag.isKnownTag("html"));
        assertFalse(Tag.isKnownTag("random"));
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
        Tag tag = Tag.valueOf("textarea");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag = Tag.valueOf("div");
        Tag tagClone = tag.clone();
        assertEquals(tag, tagClone);
        assertNotSame(tag, tagClone);
    }

    @Test
    public void equalsAndHashCodeTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        assertTrue(tag1.equals(tag2));
        assertEquals(tag1.hashCode(), tag2.hashCode());
    }

}