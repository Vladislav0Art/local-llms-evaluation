package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestParseWithNullPersonName {

    public static String parse(String xml) {
        return Jsoup.parse(xml).toString();
    }

    @Test
    public void testParseWithNullPersonName() {
        String xml = "<root><person><name>John Doe</name></person></root>";
        try {
            parser.parse(xml);
        } catch (Exception e) {
        }
        Document doc = parser.parse(xml);
        assertTrue(doc.html().isEmpty());
    }

}