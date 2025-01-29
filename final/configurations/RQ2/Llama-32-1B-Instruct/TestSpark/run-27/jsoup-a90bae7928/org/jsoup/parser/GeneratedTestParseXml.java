package org.jsoup.parser;

public class GeneratedTestParseXml {

    @Test
    public void testParseXml() {
        Document doc = Jsoup.parse("<example xmlns=\"http://example.com\"><tag1 href=\"http://example.com/1\"><tag2 href=\"http://example.com/2\"></tag2></tag1></example>");
        System.out.println(doc.xml());
    }

}