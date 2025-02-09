package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = Tag.valueOf("p");
        assertEquals("p", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = Tag.valueOf("P");
        assertEquals("p", tag.normalName());
    }

    @Test
    public void valueOfWithTagAndSettingsTest() {
        ParseSettings ps = ParseSettings.htmlDefault;
        Tag tag = Tag.valueOf("span", ps);
        assertNotNull(tag);
        assertEquals("span", tag.getName());
    }

    @Test
    public void valueOfWithTagTest() {
        Tag tag = Tag.valueOf("span");
        assertNotNull(tag);
        assertEquals("span", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("style");
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
        Tag tag = Tag.valueOf("span");
        assertTrue(tag.isKnownTag());
    }

    @Test
    public void isKnownTagWithNameTest() {
        assertTrue(Tag.isKnownTag("body"));
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
        Tag tag = Tag.valueOf("span");
        tag = tag.setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = Tag.valueOf("p");
        assertTrue(tag1.equals(tag2));

        Tag tag3 = Tag.valueOf("a");
        assertFalse(tag1.equals(tag3));
    }

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("p");
        assertNotNull(tag.hashCode());
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        assertEquals("div", tag.toString());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Tag tag1 = Tag.valueOf("p");
        Tag tag2 = (Tag) tag1.clone();
        assertEquals(tag1, tag2);
    }

}