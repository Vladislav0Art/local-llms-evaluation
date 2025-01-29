package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedContextNode {

    public static Document fromJsoup(String html) {
        return neworg.jsoup.helper.W3CDom.Converter.fromJsoup(html);
    }

    @Test
    public void contextNode() {
        Document soupDoc = fromJsoup("<html><body>Hello World!</body></html>");
        Document domDoc = new W3CDom().Converter.convert(soupDoc, null);
        Element element = (Element) domDoc.contextNode();
        System.out.println(element.outerHtml());
        return null;
    }

}