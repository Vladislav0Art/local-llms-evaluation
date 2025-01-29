package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestSetSelfClosingWithWhitespace {

    @Test
    public void testSetSelfClosingWithWhitespace() {
        // Test case for setSelfClosing method with whitespace
        TagParser tag = new TagParser();
        boolean result = tag.setSelfClosing(true);
        assertEquals(true, result);
    }

}