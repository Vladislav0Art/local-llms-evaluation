package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("DIV", new ParseSettings(true, true));
        assertEquals("div", tag.normalName());
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("span");
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
    public void isKnownTagTest() {
        assertTrue(Tag.isKnownTag("div"));
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
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void setSelfClosingTest() {
        Tag tag = Tag.valueOf("p");
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("p");
        int expectedHashCode = tag.getName().hashCode();
        assertEquals(expectedHashCode, tag.hashCode());
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.toString());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag = Tag.valueOf("p");
        Tag clonedTag = (Tag) tag.clone();
        assertEquals(tag, clonedTag);
    }

}