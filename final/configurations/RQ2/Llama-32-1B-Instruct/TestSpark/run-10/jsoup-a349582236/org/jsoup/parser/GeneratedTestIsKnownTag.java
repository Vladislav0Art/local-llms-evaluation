package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsKnownTag {

    private Parser parser = new Parser();

    @Test
    public void testIsKnownTag() {
        Map<String, String> attrs = new HashMap<>();
        attrs.put("id", "test");
        Tag tag = Tag.valueOf("test");

        assertTrue(Tag.isKnownTag("test"));

        tag = new Tag();
        assertFalse(Tag.isKnownTag("unknown"));
    }

}