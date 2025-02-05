package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);
        assertEquals(tagName, tag.getName());
    }

    @Test
    public void normalNameTest() {
        String tagName = "i";
        Tag tag = Tag.valueOf(tagName);
        assertEquals(tagName, tag.normalName());
    }

    @Test
    public void valueOfTest() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        assertSame(Tag.valueOf(tagName), tag);
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("pre");
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
        Tag tag = Tag.valueOf("br");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        assertTrue(Tag.isKnownTag("p"));
        assertFalse(Tag.isKnownTag("unknownTag"));
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
        Tag tag = Tag.valueOf("input");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void setSelfClosingTest() {
        Tag tag = Tag.valueOf("p").setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        assertEquals(tag1, tag2);
    }

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals(Tag.valueOf("p").hashCode(), tag.hashCode());
    }

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals(tag, tag.clone());
    }

    @Test
    public void toStringTest() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);
        assertEquals("<" + tagName + ">", tag.toString());
    }

}