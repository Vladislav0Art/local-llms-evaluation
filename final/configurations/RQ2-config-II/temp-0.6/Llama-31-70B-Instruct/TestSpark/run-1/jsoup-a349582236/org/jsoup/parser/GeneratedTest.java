package org.jsoup.parser;

import org.jsoup.helper.Normalizer;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private static final Map<String, Tag> tags = new HashMap<>();

    @Mock
    private Element element;

    @Test
    public void testValueOf() {
        when(element.getTagName()).thenReturn("div");
        String tagName = element.getTagName();
        Tag tag = Tag.valueOf(tagName, ParseSettings.preserveCase);
        assertEquals("div", tag.getName());
    }

    @Test
    public void testIsBlock() {
        assertTrue(Tag.valueOf("div").isBlock());
        assertFalse(Tag.valueOf("span").isBlock());
    }

    @Test
    public void testFormatAsBlock() {
        assertTrue(Tag.valueOf("div").formatAsBlock());
        assertFalse(Tag.valueOf("span").formatAsBlock());
    }

    @Test
    public void testIsEmpty() {
        assertTrue(Tag.valueOf("img").isEmpty());
        assertFalse(Tag.valueOf("div").isEmpty());
    }

    @Test
    public void testIsSelfClosing() {
        assertTrue(Tag.valueOf("img").isSelfClosing());
        assertFalse(Tag.valueOf("div").isSelfClosing());
    }

    @Test
    public void testIsKnownTag() {
        assertTrue(Tag.isKnownTag("div"));
        assertFalse(Tag.isKnownTag("unknown"));
    }

}