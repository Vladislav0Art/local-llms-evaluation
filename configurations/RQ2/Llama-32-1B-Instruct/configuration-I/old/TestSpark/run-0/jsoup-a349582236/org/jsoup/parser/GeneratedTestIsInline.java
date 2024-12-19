package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsInline {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testIsInline() {
        TestTag(tag -> assertEquals(false, tag.isInline()));
        TestTag(tag -> assertEquals(true, tag.isInline()));
    }

}