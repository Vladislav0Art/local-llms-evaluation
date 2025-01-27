package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedValueOf_tagName_parseSettings {

    @Test
    public void valueOf_tagName_parseSettings() throws Exception {
        ParseSettings settings = new ParseSettings();
        Map<String, ParseSettings> map = new HashMap<>();
        map.put("div", settings);
        Tag result = Tag.valueOf("div", map);
        assertNotNull(result);
    }

}