package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("A");
        assertEquals("A", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("IMG");
        assertEquals("img", tag.normalName());
    }

    @Test
    public void valueOfUsingSettingsTest() {
        Tag tag = Tag.valueOf("img", ParseSettings.preserveCase);
        assertEquals("img", tag.normalName());
    }

    @Test
    public void valueOfUsingNameTest() {
        Tag tag = Tag.valueOf("b");
        assertEquals("b", tag.normalName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = Tag.valueOf("a");
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
        Tag tag = Tag.valueOf("body");
        assertTrue(tag.isKnownTag());
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
        Tag tag = Tag.valueOf("p");
        tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("a");
        Tag tag2 = Tag.valueOf("a");
        assertTrue(tag1.equals(tag2));
    }

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("span");
        assertNotNull(tag.hashCode());
    }

    @Test
    public void cloneTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = tag1.clone();
        assertEquals(tag1, tag2);
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("h1");
        assertEquals("<h1>", tag.toString());
    }

}