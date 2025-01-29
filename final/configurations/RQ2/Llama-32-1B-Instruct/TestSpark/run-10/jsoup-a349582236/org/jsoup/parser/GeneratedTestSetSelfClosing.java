package org.jsoup.parser;

import org.junit.jupiter.api.Test;
import org.jsoup.parser.Parser;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestSetSelfClosing {

    private Parser parser = new Parser();

    @Test
    public void testSetSelfClosing() {
        parser.setValidate(true);
        parser.setDefaultForm(false);
        parser.setDefaultNonForm(false);

        Map<String, String> attrs = new HashMap<>();
        Tag tag = new Tag();

        assertTrue(!tag.isSelfClosing());

        tag = new Tag();
        assertFalse(tag.isSelfClosing());
    }

}