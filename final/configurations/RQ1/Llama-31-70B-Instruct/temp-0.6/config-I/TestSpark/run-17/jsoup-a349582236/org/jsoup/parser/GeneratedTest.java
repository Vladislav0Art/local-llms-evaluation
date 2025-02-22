package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void TestTag_getName() {
        Tag tag = new Tag("testTag");
        assertEquals("testTag", tag.getName());
    }

    @Test
    public void TestTag_isBlock() {
        Tag tag = new Tag("testTag");
        assertTrue(tag.isBlock());
    }

    @Test
    public void TestTag_formatAsBlock() {
        Tag tag = new Tag("testTag");
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void TestTag_isEmpty() {
        Tag tag = new Tag("testTag");
        assertFalse(tag.isEmpty());
    }

}