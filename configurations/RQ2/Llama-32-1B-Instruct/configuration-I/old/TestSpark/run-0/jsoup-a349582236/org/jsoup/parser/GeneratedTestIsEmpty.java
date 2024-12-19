package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsEmpty {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testIsEmpty() {
        TestTag(tag -> assertEquals(false, tag.isEmpty()));
        TestTag(tag -> assertEquals(true, tag.isEmpty()));
    }

}