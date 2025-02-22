package org.jsoup.parser;

import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.parser.Tag;
import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    private final Tag tag = new Tag("testTagName");

    @Test
    public void testGetName() {
        assertEquals("testTagName", tag.getName());
    }

    @Test
    public void testNormalName() {
        assertEquals("testtagname", tag.normalName());
    }

    @Test
    public void testGetBlock() {
        assertTrue(tag.isBlock());
    }

    @Test
    public void testFormatAsBlock() {
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void testEmpty() {
        assertFalse(tag.isEmpty());
    }

    @Test
    public void testSelfClosing() {
        assertFalse(tag.isSelfClosing());
    }

    @Test
    public void testPreserveWhitespace() {
        assertFalse(tag.preserveWhitespace());
    }

    @Test
    public void testIsBlock() {
        assertTrue(tag.isBlock());
    }

    @Test
    public void testFormatAsBlock() {
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void testIsEmpty() {
        assertFalse(tag.isEmpty());
    }

}