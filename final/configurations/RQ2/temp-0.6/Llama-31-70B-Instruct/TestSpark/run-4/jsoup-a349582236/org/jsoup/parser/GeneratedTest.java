package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    // Test the isBlock() method

    @Test
    public void isBlockTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isBlock());

        tag.isBlock = true;
        assertTrue(tag.isBlock());
    }

    @Test
    public void formatAsBlockTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.formatAsBlock());

        tag.formatAsBlock = true;
        assertTrue(tag.formatAsBlock());
    }

    @Test
    public void isEmptyTest() {
        Tag tag = new Tag("div");
        assertFalse(tag.isEmpty());

        tag.empty = true;
        assertTrue(tag.isEmpty());
    }

}