package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestgetName {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testgetName() {
        TestTag(tag -> assertEquals("p", tag.getName()));
        TestTag(tag -> assertEquals("div", tag.getName()));
    }

}