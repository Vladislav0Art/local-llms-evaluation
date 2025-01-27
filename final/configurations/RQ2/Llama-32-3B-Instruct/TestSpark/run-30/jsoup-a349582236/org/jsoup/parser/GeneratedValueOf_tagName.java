package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_tagName {

    public static void testGetName() {
        Tag tag = new Tag();
        String result = tag.getName();
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

}