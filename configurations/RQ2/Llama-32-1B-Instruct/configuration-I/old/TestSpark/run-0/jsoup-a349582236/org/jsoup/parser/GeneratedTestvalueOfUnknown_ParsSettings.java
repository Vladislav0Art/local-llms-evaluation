package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestvalueOfUnknown_ParsSettings {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testvalueOfUnknown_ParsSettings() {
        Document doc = Jsoup.parse("<p>Hello, world!</p>");
        Tag[] tags = doc.select("p");
        for (Tag tag : tags) {
            if (tag.getValue().equals(PARSING_DEFAULT)) {
                assertEquals(false, tag.valueOf());
            } else if (tag.getValue().equals(PARSING_EXACT)) {
                assertTrue(tag.valueOf());
            }
        }
    }

}