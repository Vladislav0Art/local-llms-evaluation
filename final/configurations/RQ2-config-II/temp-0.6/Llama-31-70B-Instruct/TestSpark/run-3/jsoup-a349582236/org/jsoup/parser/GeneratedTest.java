package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.parser.ParseSettings;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("tag1");
        assertEquals("tag1", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("tag1");
        assertEquals("tag1", tag.normalName());
    }

    @Test
    public void valueOfTagNameSettingsTest() {
        ParseSettings settings = new ParseSettings(true, true);
        Tag tag = Tag.valueOf("tag1", settings);
        assertEquals("tag1", tag.getName());
    }

    @Test
    public void valueOfTagNameTest() {
        Tag tag = Tag.valueOf("tag1");
        assertEquals("tag1", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("tag1");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("tag1");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("tag1");
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("tag1");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("tag1");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = new Tag("tag1");
        assertFalse(tag.isKnownTag());
    }

}