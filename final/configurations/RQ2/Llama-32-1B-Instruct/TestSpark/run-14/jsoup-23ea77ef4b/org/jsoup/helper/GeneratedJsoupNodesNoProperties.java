package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedJsoupNodesNoProperties {

    public static Document fromJsoup(String html) {
        return neworg.jsoup.helper.W3CDom.Converter.fromJsoup(html);
    }

    @Test
    public void JsoupNodesNoProperties() {
        Document soupDoc = fromJsoup("<html><body>Hello World!</body></html>");
        Document domDoc = new W3CDom().Converter.convert(soupDoc, null);
        Element element = (Element) domDoc.select("*").first();
        System.out.println(element.attr("style"));
        return null;
    }

}