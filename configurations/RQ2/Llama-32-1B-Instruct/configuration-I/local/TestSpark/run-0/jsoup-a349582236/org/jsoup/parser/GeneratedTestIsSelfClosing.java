package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsSelfClosing {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testIsSelfClosing() {
        TestTag(tag -> assertEquals(false, tag.isSelfClosing()));
        TestTag(tag -> assertEquals(true, tag.isSelfClosing()));
    }

}