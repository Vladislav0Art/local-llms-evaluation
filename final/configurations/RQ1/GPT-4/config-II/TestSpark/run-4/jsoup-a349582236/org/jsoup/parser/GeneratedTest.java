package org.jsoup.parser;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

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
    public void valueOfTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
        assertTrue(tag.isKnownTag());

        Tag tag1 = Tag.valueOf("unknownTag");
        assertEquals("unknowntag", tag1.getName());
        assertFalse(tag1.isKnownTag());
    }

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("P", ParseSettings.lowerCase);
        assertEquals("p", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("p");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("p");
        assertFalse(tag.formatAsBlock());
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
    public void isKnownTagTest() {
        Tag tag = Tag.valueOf("p");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagStaticTest() {
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
        Tag tag1 = new Tag("p");
        Tag tag2 = new Tag("p");
        assertTrue(tag1.equals(tag2));

        Tag tag3 = Tag.valueOf("div");
        assertFalse(tag1.equals(tag3));
    }

    @Test
    public void hashCodeTest() {
        Tag tag = new Tag("p");
        int hash = tag.hashCode();
        assertEquals(hash, tag.hashCode());
    }

    @Test
    public void cloneTest() {
        Tag tag = new Tag("p");
        Tag cloned = tag.clone();
        assertNotSame(tag, cloned);
        assertEquals(tag.getName(), cloned.getName());
    }

    @Test
    public void toStringTest() {
        Tag tag = new Tag("p");
        assertEquals("p", tag.toString());
    }

}