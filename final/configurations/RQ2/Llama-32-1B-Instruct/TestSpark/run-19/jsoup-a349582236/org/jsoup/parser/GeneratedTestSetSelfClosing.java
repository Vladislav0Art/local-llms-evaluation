package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestSetSelfClosing {

    @Test
    public void testSetSelfClosing() {
        // Test case for setSelfClosing method
        TagParser tag = new TagParser();
        boolean result = tag.setSelfClosing(true);
        assertEquals(true, result);
    }

}