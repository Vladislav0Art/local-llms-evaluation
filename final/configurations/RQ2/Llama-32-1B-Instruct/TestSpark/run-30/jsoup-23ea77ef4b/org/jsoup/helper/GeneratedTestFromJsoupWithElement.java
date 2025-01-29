package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

public class GeneratedTestFromJsoupWithElement {

    public static String toString(W3CDom w3cdom) {
        return w3cdom.toString();
    }

    @Test
    public void testFromJsoupWithElement() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Element element = builder.createElement("element");
        W3CDom w3cdom = new W3CDom();
        w3cdom.fromJsoup(element);
        System.out.println(toString(w3cdom));
    }

}