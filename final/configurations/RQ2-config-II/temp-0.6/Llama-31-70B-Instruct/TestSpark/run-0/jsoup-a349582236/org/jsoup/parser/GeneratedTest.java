package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    Tag tag;

    @Before
    public void setUp() {
        tag = new Tag("tagName");
    }

    @Test
    public void getName() {
        assertEquals("tagName", tag.getName());
    }

    @Test
    public void normalName() {
        assertEquals("tagname", tag.normalName());
    }

    @Test
    public void valueOf() {
        Tag tag = Tag.valueOf("tagName");
        assertEquals("tagName", tag.tagName);
        assertEquals("tagname", tag.normalName);
        assertTrue(tag.isBlock);
        assertTrue(tag.formatAsBlock);
        assertFalse(tag.empty);
        assertFalse(tag.selfClosing);
        assertFalse(tag.preserveWhitespace);
        assertFalse(tag.formList);
        assertFalse(tag.formSubmit);
    }

    @Test
    public void valueOfWithSettings() {
        ParseSettings settings = ParseSettings.preserveCase;
        Tag tag = Tag.valueOf("tagName", settings);
        assertEquals("tagName", tag.tagName);
        assertEquals("tagName", tag.normalName);
        assertTrue(tag.isBlock);
        assertTrue(tag.formatAsBlock);
        assertFalse(tag.empty);
        assertFalse(tag.selfClosing);
        assertFalse(tag.preserveWhitespace);
        assertFalse(tag.formList);
        assertFalse(tag.formSubmit);
    }

    @Test
    public void isBlock() {
        assertTrue(tag.isBlock());
    }

}