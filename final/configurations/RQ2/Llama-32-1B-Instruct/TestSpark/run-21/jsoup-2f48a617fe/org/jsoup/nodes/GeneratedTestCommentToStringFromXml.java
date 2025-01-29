package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestCommentToStringFromXml {

    public static Element asXmlDeclaration() {
        return new Element("xml");
    }

    @Test
    public void testCommentToStringFromXml() {
        Document document = new Document();
        Element xmlDeclaration = asXmlDeclaration();

        Document rootDocument = new Document();
        rootDocument.appendChild(xmlDeclaration);

        Elements elements = rootDocument.select("#data");

        for (Element element : elements) {
            assertEquals("some data", element.text());
        }
    }

}