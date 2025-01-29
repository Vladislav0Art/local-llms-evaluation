package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestParseWithEmptyUri {

    public static String parse(String xml) {
        return Jsoup.parse(xml).toString();
    }

    @Test
    public void testParseWithEmptyUri() {
        String xml = "<root><person id='1'><name>John Doe</name></person></root>";
        Document doc = parser.parse(xml);
        assertTrue(doc.html().isEmpty());
    }

}