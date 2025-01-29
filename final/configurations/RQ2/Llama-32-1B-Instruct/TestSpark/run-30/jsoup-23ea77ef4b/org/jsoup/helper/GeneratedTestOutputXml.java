package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

public class GeneratedTestOutputXml {

    public static String toString(W3CDom w3cdom) {
        return w3cdom.toString();
    }

    @Test
    public void testOutputXml() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.createDocument(null, "http://example.com/xsd/example.xsd", null);
        Element root = document.createElement("root");
        W3CDom w3cdom = new W3CDom();
        w3cdom.OutputXml(root);
        System.out.println(toString(w3cdom));
    }

}