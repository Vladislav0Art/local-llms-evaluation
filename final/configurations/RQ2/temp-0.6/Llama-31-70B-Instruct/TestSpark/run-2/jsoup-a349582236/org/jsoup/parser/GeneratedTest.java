package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag();
        String actual = tag.getName();
        assertNotNull(actual);
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag();
        String actual = tag.normalName();
        assertNotNull(actual);
    }

    @Test
    public void valueOfWithSettingsTest() {
        String tagName = "div";
        ParseSettings settings = new ParseSettings();
        Tag actual = Tag.valueOf(tagName, settings);
        assertNotNull(actual);
    }

    @Test
    public void valueOfWithoutSettingsTest() {
        String tagName = "div";
        Tag actual = Tag.valueOf(tagName);
        assertNotNull(actual);
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag();
        boolean actual = tag.isBlock();
        assertTrue(actual || !actual);
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag();
        boolean actual = tag.formatAsBlock();
        assertTrue(actual || !actual);
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag();
        boolean actual = tag.isInline();
        assertTrue(actual || !actual);
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag();
        boolean actual = tag.isEmpty();
        assertTrue(actual || !actual);
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag();
        boolean actual = tag.isSelfClosing();
        assertTrue(actual || !actual);
    }

}