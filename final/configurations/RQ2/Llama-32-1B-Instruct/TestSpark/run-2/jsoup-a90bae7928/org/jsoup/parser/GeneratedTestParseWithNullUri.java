package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestParseWithNullUri {

    public static String parse(String xml) {
        return Jsoup.parse(xml).toString();
    }

    @Test
    public void testParseWithNullUri() {
        String xml = "<root><person id='1'><name>John Doe</name></person></root>";
        try {
            parser.parse(null);
        } catch (Exception e) {
        }
        Document doc = parser.parse(xml);
        assertTrue(doc.html().isEmpty());
    }

}