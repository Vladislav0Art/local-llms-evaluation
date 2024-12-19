package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestNormalName {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testNormalName() {
        TestTag(tag -> assertEquals("", tag.getNormalName()));
        TestTag(tag -> assertEquals("  p  ", tag.getNormalName()));
    }

}