package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

public class GeneratedTestFromJsoup {

    public static String toString(W3CDom w3cdom) {
        return w3cdom.toString();
    }

    @Test
    public void testFromJsoup() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse("org.jsoup.nodes.Document");
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup(document);
        System.out.println(toString(w3cdom));
    }

}