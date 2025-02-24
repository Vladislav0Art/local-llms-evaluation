package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.Tag;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.ParseSettings;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag();
        String name = tag.getName();
        assertEquals("tag", name);
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag();
        String normalName = tag.normalName();
        assertEquals("tag", normalName);
    }

    @Test
    public void valueOfTest() {
        Tag tag = new Tag();
        String tagName = "a";
        ParseSettings settings = mock(ParseSettings.class);
        Tag valueOf = tag.valueOf(tagName, settings);
        assertEquals(tagName, valueOf.getName());
    }

    @Test
    public void valueOfTest2() {
        Tag tag = new Tag();
        String tagName = "a";
        Tag valueOf = tag.valueOf(tagName);
        assertEquals(tagName, valueOf.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag();
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag();
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag();
        assertFalse(tag.isEmpty());
    }

}