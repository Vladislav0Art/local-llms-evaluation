package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestFormatAsBlock {

    private Parser parser = new Parser();

    @Test
    public void testFormatAsBlock() {
        parser.setValidate(true);
        parser.setDefaultForm(false);
        parser.setDefaultNonForm(false);

        Tag tag = new Tag();
        assertEquals("block", tag.formatAsBlock());

        tag = new Tag();
        assertTrue(tag.formatAsBlock());
    }

}