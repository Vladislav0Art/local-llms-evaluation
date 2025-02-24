package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    Tag tag;

    @Test
    public void getNameTest() {
        tag = new Tag("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void getNameEmptyTest() {
        tag = new Tag("");
        assertEquals("", tag.getName());
    }

    @Test
    public void getNameNullTest() {
        tag = new Tag(null);
        assertNull(tag.getName());
    }

    @Test
    public void normalNameTest() {
        tag = new Tag("div");
        assertEquals("div", tag.normalName());
    }

    @Test
    public void normalNameNullTest() {
        tag = new Tag(null);
        assertNull(tag.normalName());
    }

    @Test
    public void valueOfTest() {
        tag = Tag.valueOf("div");
        assertEquals("div", tag.getName());
    }

    @Test
    public void valueOfNullTest() {
        tag = Tag.valueOf(null);
        assertNull(tag.getName());
    }

    @Test
    public void isBlockTest() {
        tag = Tag.valueOf("div");
        assertTrue(tag.isBlock());
    }

    @Test
    public void isBlockNullTest() {
        tag = Tag.valueOf(null);
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        tag = Tag.valueOf("div");
        assertTrue(tag.formatAsBlock());
    }

}