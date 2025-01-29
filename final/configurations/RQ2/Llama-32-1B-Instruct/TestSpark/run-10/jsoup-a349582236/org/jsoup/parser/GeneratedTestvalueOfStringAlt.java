package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestvalueOfStringAlt {

    private Parser parser = new Parser();

    @Test
    public void testvalueOfStringAlt() {
        parser.setValidate(true);
        parser.setDefaultForm(false);
        parsersetDefaultNonForm(false);

        Map<String, String> attrs = new HashMap<>();
        attrs.put("id", "test");
        Tag tag = Tag.valueOf("test");

        assertEquals("", tag.getName());
        assertEquals("test", tag.normalName());
    }

}