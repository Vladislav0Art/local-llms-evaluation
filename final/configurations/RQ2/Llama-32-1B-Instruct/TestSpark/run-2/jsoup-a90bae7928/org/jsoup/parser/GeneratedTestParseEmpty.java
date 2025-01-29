package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestParseEmpty {

    public static String parse(String xml) {
        return Jsoup.parse(xml).toString();
    }

    @Test
    public void testParseEmpty() {
        String xml = "";
        Document doc = parser.parse(xml);
        assertTrue(doc.html().isEmpty());
    }

}