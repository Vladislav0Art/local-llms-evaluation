package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

import java.util.HashMap;
import java.util.Map;

public class GeneratedNormalName {

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

}