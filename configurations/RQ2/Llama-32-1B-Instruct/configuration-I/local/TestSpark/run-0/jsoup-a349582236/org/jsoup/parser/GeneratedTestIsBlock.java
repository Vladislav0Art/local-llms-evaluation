package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsBlock {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testIsBlock() {
        TestTag(tag -> assertEquals(false, tag.isBlock()));
        TestTag(tag -> assertEquals(true, tag.isBlock()));
    }

}