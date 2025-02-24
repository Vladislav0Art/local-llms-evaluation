package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getNameTest() {
        Tag tag = new Tag("test");
        assertEquals("test", tag.getName());
    }

    @Test
    public void normalNameTest() {
        Tag tag = new Tag("test");
        assertEquals("test", tag.normalName());
    }

    @Test
    public void valueOfTest() {
        Tag tag = Tag.valueOf("test");
        assertEquals("test", tag.getName());
    }

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("test");
        assertFalse(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("test");
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void isInlineTest() {
        Tag tag = new Tag("test");
        assertFalse(tag.isInline());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("test");
        assertFalse(tag.isEmpty());
    }

    @Test
    public void isSelfClosingTest() {
        Tag tag = new Tag("test");
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void isKnownTagTest() {
        Tag tag = new Tag("test");
        assertFalse(tag.isKnownTag());
    }

    @Test
    public void preserveWhitespaceTest() {
        Tag tag = new Tag("test");
        assertFalse(tag.preserveWhitespace());
    }

}