package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestIsKnownTagUnknownTag {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testIsKnownTagUnknownTag() {
        TestTag(tag -> assertEquals(false, tag.isKnownTag("unknown")));
        TestTag(tag -> assertEquals(true, tag.isKnownTag("unknown")));
    }

}