package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    public static void testGetName() {
        Tag tag = new Tag();
        String result = tag.getName();
        assertNotNull(result);
    }

    @Test
    public void normalName() {
        Tag tag = new Tag();
        String result = tag.normalName();
        assertNotNull(result);
    }

    public static void testValueOf_tagName_parseSettings() throws Exception {
        ParseSettings settings = new ParseSettings();
        Map<String, ParseSettings> map = new HashMap<>();
        map.put("div", settings);
        Tag result = Tag.valueOf("div", map);
        assertNotNull(result);
    }

    @Test
    public void valueOf_tagName() throws Exception {
        Tag result = Tag.valueOf("img");
        assertNotNull(result);
    }

    public static void testIsBlock_empty() {
        Tag tag = new Tag();
        boolean result = tag.isBlock();
        assertFalse(result);
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

    @Test
    public void isFormListed_defaultValue() {
        Tag tag = new Tag();
        boolean result = tag.isFormListed();
        assertTrue(result);
    }

    public static void testPreserveWhitespace_false() {
        Tag tag = new Tag();
        assertFalse(tag.preserveWhitespace());
    }
}

}