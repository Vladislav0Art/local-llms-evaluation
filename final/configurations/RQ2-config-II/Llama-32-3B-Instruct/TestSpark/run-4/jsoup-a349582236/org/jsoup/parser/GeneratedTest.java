package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.reflect.Method;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTest {

    @Test
    public void getName() {
        String name = "div";
        assertEquals(name, org.jsoup.parser.Tag.valueOf(name).getName());
    }

    @Test
    public void normalName() {
        String tagName = "html";
        assertEquals("HTML", Tag.normalName(tagName));
    }

    @Test
    public void isBlock() {
        boolean result = org.jsoup.parser.Tag.valueOf("div").isBlock();
        assertTrue(result);
    }

    @Test
    public void formatAsBlock() {
        boolean result = org.jsoup.parser.Tag.valueOf("div").formatAsBlock();
        assertFalse(result);
    }

    @Test
    public void isInline() {
        boolean result = org.jsoup.parser.Tag.valueOf("span").isInline();
        assertTrue(result);
    }

    @Test
    public void isEmpty() {
        Tag tag = org.jsoup.parser.Tag.valueOf("");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosing() {
        boolean result = org.jsoup.parser.Tag.valueOf("img").isSelfClosing();
        assertTrue(result);
    }

    @Test
    public void isKnownTag() {
        boolean result = org.jsoup.parser.Tag.valueOf("").isKnownTag();
        assertFalse(result);
    }

    @Test
    public void isFormListed() {
        boolean result = org.jsoup.parser.Tag.valueOf("form").isFormListed();
        assertTrue(result);
    }

    @Test
    public void isFormSubmittable() {
        boolean result = org.jsoup.parser.Tag.valueOf("input").isFormSubmittable();
        assertTrue(result);
    }

    @Test
    public void setSelfClosing() {
        Tag tag = org.jsoup.parser.Tag.valueOf("");
        tag.setSelfClosing();
        assertEquals(Tag.selfClosing, tag.isSelfClosing());
    }

    @Test
    public void equals() {
        String tagName1 = "div";
        String tagName2 = "div";

        boolean result1 = Tag.valueOf(tagName1).equals(org.jsoup.parser.Tag.valueOf(tagName2));
        assertTrue(result1);

        boolean result2 = org.jsoup.parser.Tag.valueOf("").equals(org.jsoup.parser.Tag.valueOf(""));
        assertTrue(result2);
    }

    @Test
    public void hashCode() {
        String tagName1 = "div";
        String tagName2 = "div";

        assertEquals(0, org.jsoup.parser.Tag.valueOf(tagName1).hashCode());
        assertEquals(0, org.jsoup.parser.Tag.valueOf(tagName2).hashCode());

        assertEquals(Tag.selfClosing, org.jsoup.parser.Tag.valueOf("").hashCode());
    }

    @Test
    public void clone() {
        Tag tag = org.jsoup.parser.Tag.valueOf("");
        Tag clonedTag = (Tag) tag.clone();
        assertNotNull(clonedTag);
        assertFalse(tag.equals(clonedTag));
    }

}