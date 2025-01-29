package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsInline {

    private Parser parser = new Parser();

    @Test
    public void testIsInline() {
        parser.setValidate(true);
        parser.setDefaultForm(false);
        parsersetDefaultNonForm(false);

        Tag tag = new Tag();
        assertTrue(tag.isInline());

        tag = new Tag();
        assertFalse(tag.isInline());
    }

}