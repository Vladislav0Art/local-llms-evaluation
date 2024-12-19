package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestvalueOf_ParsSettings {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testvalueOf_ParsSettings() {
        Document doc = Jsoup.parse("<p>Hello, world!</p>");
        Tag[] tags = doc.select("p");
        for (Tag tag : tags) {
            if (tag.getValue().equals(PARSING_DEFAULT)) {
                assertEquals(true, tag.valueOf());
            } else if (tag.getValue().equals(PARSING_EXACT)) {
                assertTrue(tag.valueOf());
            }
        }
    }

}