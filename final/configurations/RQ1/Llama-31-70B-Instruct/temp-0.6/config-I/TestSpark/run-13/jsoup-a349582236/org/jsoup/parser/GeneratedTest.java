package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testValueOfWithoutSettings() {
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName);

        assertNotNull(tag);
        assertEquals(tagName, tag.tagName);
    }

    @Test
    public void testValueOfWithSettings() {
        ParseSettings settings = Mockito.mock(ParseSettings.class);
        Mockito.when(settings.normalizeTag(Mockito.anyString())).thenReturn("normalizedTag");
        String tagName = "p";
        Tag tag = Tag.valueOf(tagName, settings);

        assertNotNull(tag);
        assertEquals("normalizedTag", tag.tagName);
    }

    @Test
    public void testGetName() {
        Tag tag = new Tag("p");

        assertEquals("p", tag.getName());
    }

    @Test
    public void testNormalName() {
        Tag tag = new Tag("p");

        assertEquals("p", tag.normalName());
    }

    @Test
    public void testIsBlock() {
        Tag tag = new Tag("p");
        tag.isBlock = true;

        assertTrue(tag.isBlock());
    }

    @Test
    public void testFormatAsBlock() {
        Tag tag = new Tag("p");
        tag.formatAsBlock = true;

        assertTrue(tag.formatAsBlock());
    }

}