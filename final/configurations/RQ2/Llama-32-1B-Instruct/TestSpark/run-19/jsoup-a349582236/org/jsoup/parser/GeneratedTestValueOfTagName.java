package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestValueOfTagName {

    @Test
    public void testValueOfTagName() {
        String tagName = "span";
        Map<String, Object> expected = new HashMap<>();
        expected.put("name", tagName);
        Tag tag = org.jsoup.parser.Tag.valueOf(tagName);
        assertEquals(expected, tag);
    }

}