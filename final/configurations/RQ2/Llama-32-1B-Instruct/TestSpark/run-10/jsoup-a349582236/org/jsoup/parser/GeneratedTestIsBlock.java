package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestIsBlock {

    private Parser parser = new Parser();

    @Test
    public void testIsBlock() {
        parser.setValidate(true);
        parser.setDefaultForm(false);
        parsersetDefaultNonForm(false);

        Tag tag = new Tag();
        assertTrue(tag.isBlock());

        tag = new Tag();
        assertFalse(tag.isBlock());
    }

}