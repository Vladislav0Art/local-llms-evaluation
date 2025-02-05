package org.jsoup.parser;

import org.junit.Assert;
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
        Tag tag = Tag.valueOf("DiV");
        assertEquals("div", tag.normalName());
    }

    @Test
    public void valueOfWithSettingsTest() {
        Tag tag = Tag.valueOf("span", ParseSettings.htmlDefault);
        assertEquals("span", tag.getName());
    }

    @Test
    public void valueOfWithoutSettingsTest() {
        Tag tag = Tag.valueOf("span");
        assertEquals("span", tag.getName());
    }

    @Test
    public void isKnownTagTest() {
        assertTrue(Tag.isKnownTag("div"));
        assertFalse(Tag.isKnownTag("unknownTag"));
    }

    @Test
    public void isBlockTest() {
        Tag tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = Tag.valueOf("div");
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
    public void isFormListedTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormListed());
    }

    @Test
    public void isFormSubmittableTest() {
        Tag tag = Tag.valueOf("button");
        assertTrue(tag.isFormSubmittable());
    }

    @Test
    public void setSelfClosingTest() {
        Tag tag = Tag.valueOf("div").setSelfClosing();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void equalsTest() {
        Tag tag1 = Tag.valueOf("div");
        Tag tag2 = Tag.valueOf("div");
        assertEquals(tag1, tag2);
    }

    @Test
    public void hashCodeTest() {
        Tag tag = Tag.valueOf("div");
        Assert.assertEquals(tag.getName().hashCode(), tag.hashCode());
    }

    @Test
    public void toStringTest() {
        Tag tag = Tag.valueOf("div");
        String tagString = tag.toString();
        assertEquals("<div>", tagString);
    }

    @Test
    public void cloneTest() {
        Tag tag = Tag.valueOf("div");
        Tag cloneTag = tag.clone();
        assertEquals(tag, cloneTag);
    }

}