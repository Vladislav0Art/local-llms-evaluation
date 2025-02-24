package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("name");
        assertEquals("name", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("name");
        assertEquals("name", tag.normalName());
    }

    @Test
    public void valueOfWithoutSettingsTest() {
        Tag tag = Tag.valueOf("name");
        assertEquals("name", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("name");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("name");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("name");
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("name");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("name");
        assertFalse(tag.isSelfClosing());
    }

}