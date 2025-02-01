package org.jsoup.parser;

import org.jsoup.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

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
    public void valueOfPreserveTagCaseTest() {
        Tag tag = Tag.valueOf("P", new ParseSettings(true, true));
        assertEquals("P", tag.getName());
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void valueOfLowerCaseTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("p", tag.getName());
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void valueOfUnknownTagTest() {
        Tag tag = Tag.valueOf("unknown");
        assertEquals("unknown", tag.getName());
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("i");
        assertTrue(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = Tag.valueOf("br");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        assertEquals(tag1, tag2);
    }

    @Test
    public void notEqualsTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("div");
        assertNotEquals(tag1, tag2);
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("img");
        assertEquals("img", tag.toString());
    }

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("div");
        Tag clone = tag.clone();
        assertEquals(tag, clone);
    }

}