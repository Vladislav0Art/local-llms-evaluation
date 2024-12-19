package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestFormatAsBlock {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testFormatAsBlock() {
        TestTag(tag -> assertEquals(false, tag.formatAsBlock()));
        TestTag(tag -> assertEquals(true, tag.formatAsBlock()));
    }

}