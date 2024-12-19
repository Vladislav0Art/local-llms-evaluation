package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedTestValueOf_ParsSettings {

    private static final String PARSING_DEFAULT = "parseDefault";
    private static final String PARSING_EXACT = "parseExact";

    @Test
    public void testValueOf_ParsSettings() {
        Document doc = Jsoup.parse("<p>Hello, world!</p>");
        Tag[] tags = doc.select("p");
        for (Tag tag : tags) {
            assertEquals(Tag.valueOf(PARSING_DEFAULT), tag.getValue());
        }
    }

}