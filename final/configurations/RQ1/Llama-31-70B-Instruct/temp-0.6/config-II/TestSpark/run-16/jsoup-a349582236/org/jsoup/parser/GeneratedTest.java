package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    // Test 1: Check if the tag's name is correctly set in the constructor.

    @Test
    public void tagNameIsSetCorrectlyInConstructor() {
        Tag tag = new Tag("p");
        assertEquals("p", tag.tagName);
    }

    @Test
    public void tagNormalNameIsSetCorrectlyInConstructor() {
        Tag tag = new Tag("p");
        assertEquals("p", tag.normalName);
    }

    @Test
    public void tagBlockPropertyIsSetCorrectlyInConstructor() {
        Tag tag = new Tag("p");
        assertTrue(tag.isBlock);
    }

}