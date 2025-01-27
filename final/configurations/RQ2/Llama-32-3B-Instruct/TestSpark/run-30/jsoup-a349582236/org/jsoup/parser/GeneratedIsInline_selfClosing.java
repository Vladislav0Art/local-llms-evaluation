package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_selfClosing {

    public static void testGetName() {
        Tag tag = new Tag();
        String result = tag.getName();
        assertNotNull(result);
    }

    @Test
    public void isInline_selfClosing() {
        Tag tag = new Tag();
        tag.setSelfClosing();
        boolean result = tag.isInline();
        assertTrue(result);
    }

    public static void testFormatAsBlock_false() {
        Tag tag = new Tag();
        assertFalse(tag.formatAsBlock());
    }

}