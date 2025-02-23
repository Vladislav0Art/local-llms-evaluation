package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagConstructor_shouldCreateTagWithCorrectName {

    // Tests for the Tag constructor

    @Test
    public void tagConstructor_shouldCreateTagWithCorrectName() {
        String tagName = "test";
        Tag tag = new Tag(tagName);
        assertEquals(tagName, tag.tagName);
    }

}