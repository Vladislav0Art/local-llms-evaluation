package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsFormSubmittable {

    private Parser parser = new Parser();

    @Test
    public void testIsFormSubmittable() {
        Map<String, String> attrs = new HashMap<>();
        attrs.put("id", "test");
        Tag tag = new Tag();

        assertTrue(!tag.isSelfClosing());

        tag = new Tag();
        assertFalse(tag.isSelfClosing());
    }

}