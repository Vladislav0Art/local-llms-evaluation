package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedContextNodeNoContent {

    public static Document fromJsoup(String html) {
        return neworg.jsoup.helper.W3CDom.Converter.fromJsoup(html);
    }

    @Test
    public void contextNodeNoContent() {
        Document soupDoc = fromJsoup("<html><body>Hello World!</body></html>");
        Document domDoc = new W3CDom().Converter.convert(soupDoc, null);
        Element element = (Element) domDoc.contextNode();
        if (element != null && !element.hasAttr("content")) {
            System.out.println(element.toString());
        } else {
            System.out.println("No content found");
        }
        return null;
    }

}