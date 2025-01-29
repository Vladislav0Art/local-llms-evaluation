package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.junit.jupiter.api.Test;

public class GeneratedTestGetPublicTagWithWhitespace {

    @Test
    public void testGetPublicTagWithWhitespace() {
        // Test case for getPublicTag method with whitespace
        String tag = "div   ";
        assertEquals("div", TagParser.getPublicTag(tag));
    }

}