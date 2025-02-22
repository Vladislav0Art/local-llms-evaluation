package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedTest {

    // Testing the Tag(String) constructor

    @Test
    public void testTagConstructor() {
        Tag tag = new Tag("test");
        assertEquals("test", tag.tagName);
        assertEquals("test", tag.normalName);
        assertTrue(tag.isBlock);
        assertTrue(tag.formatAsBlock);
        assertFalse(tag.empty);
        assertFalse(tag.selfClosing);
        assertFalse(tag.preserveWhitespace);
        assertFalse(tag.formList);
        assertFalse(tag.formSubmit);
    }

}