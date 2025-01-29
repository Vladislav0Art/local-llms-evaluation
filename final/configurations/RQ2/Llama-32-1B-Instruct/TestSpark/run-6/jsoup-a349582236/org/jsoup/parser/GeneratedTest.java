package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testName() {
        String expectedName = TAG_NAME;
        assertEquals(expectedName, Tag.valueOf(TAG_NAME).getName());
    }

    @Test
    public void testNormalName() {
        String expectedName = TAG_NAME;
        String normalName = Tag.valueOf(TAG_NAME).normalName();
        assertEquals(expectedName, normalName);
    }

    @Test
    public void testParseSettings() {
        ParseSettings settings = new ParseSettings();
        expectedValues.put("settingsKey", "value");
        mock(parseSettings(settings));
        Tag value = Tag.valueOf(TAG_NAME, settings);
        when(value.getParseSettings()).thenReturn(settings);
        assertEquals(expectedValues, value.getParseSettings());
    }

    @Test
    public void testValueOf() {
        String tagName = TAG_NAME;
        expectedValues.put(tagName, "test-value");
        Tag tag = new Tag();
        tag.setValue("test-value");
        Tag value = Tag.valueOf(tagName);
        when(value.parseTagName()).thenReturn(tagName);
        assertEquals(expectedValues, value.getParseTagName());
    }

    @Test
    public void testValueOfUnknownTag() {
        String tagName = TAG_NAME;
        expectedValues.put(tagName, "test-value");
        Tag tag = new Tag();
        tag.setValue("test-value");
        Tag value = Tag.valueOf(tagName);
        when(value.parseTagName()).thenReturn(tagName);
        assertEquals(expectedValues, value.getParseTagName());
    }

    @Test
    public void testIsBlock() {
        boolean result = tag.isBlock();
        assertTrue(result);
    }

    @Test
    public void testFormatAsBlock() {
        boolean result = tag.formatAsBlock();
        assertTrue(result);
    }

    @Test
    public void testIsInline() {
        boolean result = tag.isInline();
        assertFalse(result);
    }

    @Test
    public void testIsEmpty() {
        boolean isEmptyResult = tag.isEmpty();
        assertTrue(isEmptyResult);
    }

    @Test
    public void testIsSelfClosing() {
        boolean result = tag.isSelfClosing();
        assertTrue(result);
    }

    @Test
    public void testIsKnownTag() {
        boolean result = Tag.isKnownTag(TAG_NAME);
        assertTrue(result);
    }

    @Test
    public void testIsKnownTagUnknownTag() {
        boolean result = Tag.isKnownTag("unknown-tag");
        assertFalse(result);
    }

}