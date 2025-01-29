package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Selector;

public class GeneratedTestOutputHtml {

    public static String toString(W3CDom w3cdom) {
        return w3cdom.toString();
    }

    @Test
    public void testOutputHtml() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();
        Element root = document.createElement("root");
        root.setAttribute("data-name", "root");
        root.appendChild(document.importNode(document.getDocumentElement(), true));
        W3CDom w3cdom = new W3CDom();
        w3cdom.OutputHtml(root);
        System.out.println(toString(w3cdom));
    }

}