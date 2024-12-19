package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsKnownTag {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testIsKnownTag() {
        TestTag(tag -> assertEquals(false, tag.isKnownTag()));
        TestTag(tag -> assertEquals(true, tag.isKnownTag()));
    }

}