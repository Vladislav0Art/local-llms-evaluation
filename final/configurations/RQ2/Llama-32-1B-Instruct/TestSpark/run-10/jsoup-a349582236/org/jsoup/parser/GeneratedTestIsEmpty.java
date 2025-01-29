package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsEmpty {

    private Parser parser = new Parser();

    @Test
    public void testIsEmpty() {
        parser.setValidate(true);
        parser.setDefaultForm(false);
        parser.setDefaultNonForm(false);

        Map<String, String> attrs = new HashMap<>();
        Tag tag = new Tag();

        assertTrue(!tag.isEmpty());

        tag = new Tag();
        assertFalse(tag.isEmpty());
    }

}