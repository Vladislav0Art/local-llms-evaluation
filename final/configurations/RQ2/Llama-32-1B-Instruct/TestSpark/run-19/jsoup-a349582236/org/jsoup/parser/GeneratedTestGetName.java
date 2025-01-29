package org.jsoup.parser;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestGetName {

    @Test
    public void testGetName() {
        String tagName = "span";
        Map<String, Object> expected = new HashMap<>();
        expected.put("name", tagName);
        Tag tag = new Tag();
        assertEquals(tag.getName(), expected);
    }

}