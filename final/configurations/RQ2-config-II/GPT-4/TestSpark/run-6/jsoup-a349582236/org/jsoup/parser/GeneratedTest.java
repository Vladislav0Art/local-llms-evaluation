package org.jsoup.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("a");
        assertEquals("a", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("A");
        assertEquals("a", tag.normalName());
    }

    @Test
    public void valueOfWithSettingsTest() {
        ParseSettings settings = new ParseSettings(true, true);
        Tag tag = Tag.valueOf("a", settings);
        assertEquals("A", tag.getName());
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("a");
        assertEquals("a", tag.getName());
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
        Tag tag = Tag.valueOf("img");
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagInstanceMethodTest() {
        Tag tag = Tag.valueOf("a");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagStaticMethodTest() {
        assertTrue(Tag.isKnownTag("a"));
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
        Tag tag = Tag.valueOf("a").setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void equalsTest() {
        Tag tag = Tag.valueOf("a");
        Tag anotherTag = Tag.valueOf("a");
        assertTrue(tag.equals(anotherTag));
    }

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("a");
        Tag anotherTag = Tag.valueOf("a");
        assertTrue(tag.hashCode() == anotherTag.hashCode());
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("a");
        assertTrue(tag.toString().equalsIgnoreCase("<a>"));
    }

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("a");
        Tag clonedTag = tag.clone();
        assertEquals(tag.getName(), clonedTag.getName());
    }

}