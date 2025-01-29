package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCommentData {

    public static Element asXmlDeclaration() {
        return new Element("xml");
    }

    @Test
    public void testCommentData() {
        Document document = new Document();
        Elements elements = document.select("#data");

        for (Element element : elements) {
            assertEquals("some data", element.text());
        }
    }

}