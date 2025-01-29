package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestEquals {

    private Parser parser = new Parser();

    @Test
    public void testEquals() {
        parser.setValidate(true);
        parser.setDefaultForm(false);
        parser.setDefaultNonForm(false);

        Map<String, String> attrs1 = new HashMap<>();
        attrs1.put("id", "test");
        Tag tag1 = new Tag();
        Map<String, String> attrs2 = new HashMap<>();
        attrs2.put("id", "test");
        Tag tag2 = new Tag();

        assertEquals(tag1, tag2);

        tag1 = new Tag();
        assertFalse(tag1.equals(tag2));
    }

}