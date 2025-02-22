package org.jsoup.parser;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        String tagName = "div";
        Tag tag = new Tag(tagName);

        assertEquals(tagName, tag.getName());
    }

    @Test
    public void normalNameTest() {
        String tagName = "DIV";
        Tag tag = new Tag(tagName);

        assertEquals("div", tag.normalName());
    }

    @Test
    public void getNameNormalizedTest() {
        String tagName = "DIV";
        Tag tag = new Tag(tagName);

        assertEquals("div", tag.normalName());
    }

    @Test
    public void isBlockTest() {
        String tagName = "div";
        Tag tag = new Tag(tagName);

        assertTrue(tag.isBlock());
    }

    @Test
    public void isBlockFalseTest() {
        String tagName = "span";
        Tag tag = new Tag(tagName);

        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        String tagName = "div";
        Tag tag = new Tag(tagName);

        assertTrue(tag.formatAsBlock());
    }

}