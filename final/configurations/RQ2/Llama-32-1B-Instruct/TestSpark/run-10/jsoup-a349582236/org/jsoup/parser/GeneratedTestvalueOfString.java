package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestvalueOfString {

    private Parser parser = new Parser();

    @Test
    public void testvalueOfString() {
        parser.setValidate(true);
        parser.setDefaultForm(false);
        parser.setDefaultNonForm(false);

        Map<String, String> attrs = new HashMap<>();
        attrs.put("id", "test");
        Tag tag = Tag.valueOf("test");

        assertEquals("test", tag.getName());
        assertEquals("", tag.normalName());
    }

}