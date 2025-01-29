package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testGetName() {
        assertTrue(Tag.class.isInstance(new Tag()));
        assertEquals("div", new Tag().getName());
    }

    @Test
    public void testNormalName() {
        assertEquals("inline", new Tag().normalName());
    }

    @Test
    public void testvalueOfTagNames() {
        assertNotSame(0, Tag.valueOf("a").hashCode());
        assertTrue(Tag.valueOf("p").equals(new Tag()));
    }

    @Test
    public void testValueOfTagNamesWithSettings() {
        Map<String, ParseSettings> settings = new HashMap<>();
        settings.put("type", "script");
        assertEquals(1, Tag.valueOf("script", settings).hashCode());
    }

    @Test
    public void testIsBlock() {
        assertTrue(Tag.isBlock());
    }

    @Test
    public void testFormatAsBlock() {
        assertFalse(Tag.formatAsBlock());
    }

    @Test
    public void testIsInline() {
        assertTrue(Tag.isInline());
    }

    @Test
    public void testIsEmpty() {
        assertFalse(Tag.isEmpty());
    }

    @Test
    public void testIsSelfClosing() {
        assertTrue(Tag.isSelfClosing());
    }

    @Test
    public void testIsKnownTag() {
        assertTrue(Tag.isKnownTag("img"));
    }

    @Test
    public void testIsKnownTagWithSettings() {
        Map<String, Object> settings = new HashMap<>();
        settings.put("type", "image");
        assertEquals(1, Tag.valueOf("img", settings).hashCode());
    }

    @Test
    public void testPreserveWhitespace() {
        assertTrue(Tag.preserveWhitespace());
    }

    @Test
    public void testIsFormListed() {
        assertFalse(Tag.isFormListed());
    }

    @Test
    public void testIsFormSubmittable() {
        assertFalse(Tag.isFormSubmittable());
    }

    @Test
    public void testSetSelfClosing() {
        Tag tag = new Tag();
        assertEquals(true, tag.setSelfClosing());
        assertTrue(tag.getSelfClosing());
    }

}