package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testGetTagName() {
        Tag tag = new Tag();
        assertEquals("tag", tag.getName());
    }

    @Test
    public void testNormalName() {
        Tag tag = new Tag();
        assertEquals("TAG", tag.normalName());
    }

    @Test
    public void testGetValueOrDefault() {
        ParseSettings settings = new ParseSettings();
        Tag tag = Tag.valueOf("p");
        assertEquals("P", tag.getValueOrDefault(settings));
        tag = Tag.valueOf("DIV");
        assertEquals("DIV", tag.getValueOrDefault(settings));
    }

    @Test
    public void testGetTagName() {
        String tagName = "p";
        Tag tag = new Tag();
        try {
            tag = Tag.valueOf(tagName, settings);
        } catch (Exception e) {
            fail("Got exception: " + e.getMessage());
        }
        assertEquals("P", tag.getName());
    }

    @Test
    public void testGetTagValueOrDefault() {
        ParseSettings settings = new ParseSettings();
        String tagName = "p";
        Tag tag = new Tag();
        try {
            tag = Tag.valueOf(tagName, settings);
        } catch (Exception e) {
            fail("Got exception: " + e.getMessage());
        }
        assertEquals("unknown", tag.getValueOrDefault(settings));
    }

    @Test
    public void testGetTagNameCaseInsensitive() {
        String tagName = "P";
        Tag tag = new Tag();
        try {
            tag = Tag.valueOf(tagName, settings);
        } catch (Exception e) {
            fail("Got exception: " + e.getMessage());
        }
        assertEquals("p", tag.getName());
    }

    @Test
    public void testIsBlock() {
        Tag tag = new Tag();
        assertTrue(tag.isBlock());
    }

    @Test
    public void testFormatAsBlock() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

    @Test
    public void testIsInline() {
        Tag tag = new Tag();
        assertFalse(tag.isInline());
    }

    @Test
    public void testIsEmpty() {
        Tag tag = new Tag();
        assertTrue(tag.isEmpty());
    }

    @Test
    public void testIsSelfClosing() {
        Tag tag = new Tag();
        assertTrue(tag.isSelfClosing());
    }

    @Test
    public void testIsKnownTag() {
        String tagName = "p";
        Tag tag = new Tag();
        try {
            tag = Tag.valueOf(tagName, settings);
        } catch (Exception e) {
            fail("Got exception: " + e.getMessage());
        }
        assertTrue(Tag.isKnownTag(tagName));
    }

    @Test
    public void testIsKnownTagCaseInsensitive() {
        String tagName = "P";
        Tag tag = new Tag();
        try {
            tag = Tag.valueOf(tagName, settings);
        } catch (Exception e) {
            fail("Got exception: " + e.getMessage());
        }
        assertTrue(Tag.isKnownTag(tagName));
    }

    @Test
    public void testGetFormListed() {
        Tag tag = new Tag();
        assertFalse(tag.isFormListed());
    }

    @Test
    public void testIsFormSubmittable() {
        Tag tag = new Tag();
        assertFalse(tag.isFormSubmittable());
    }

}