package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    // Tests for the Tag constructor

    @Test
    public void tagConstructor_shouldCreateTagWithCorrectName() {
        String tagName = "test";
        Tag tag = new Tag(tagName);
        assertEquals(tagName, tag.tagName);
    }

    @Test
    public void tagConstructor_shouldThrowExceptionForNullTagName() {
        String tagName = null;
        try {
            new Tag(tagName);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Tag name must not be null"));
        }
    }

    @Test
    public void tagConstructor_shouldThrowExceptionForEmptyTagName() {
        String tagName = "";
        try {
            new Tag(tagName);
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Tag name must not be empty"));
        }
    }

    @Test
    public void getName_shouldReturnCorrectName() {
        String tagName = "test";
        Tag tag = new Tag(tagName);
        assertEquals(tagName, tag.getName());
    }

}