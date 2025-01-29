package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestValueOfTag {

    @Test
    public void testValueOfTag() {
        String tagName = "span";
        ParseSettings settings = new ParseSettings();
        Map<String, Object> props = new HashMap<>();
        props.put(ParseSettings.SrcRootUrl, "https://example.com");
        Tag tag = org.jsoup.parser.Tag.valueOf(tagName, settings);
        assertNotNull(tag);
    }

}