package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTagConstructor_shouldThrowExceptionForEmptyTagName {

    // Tests for the Tag constructor

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

}