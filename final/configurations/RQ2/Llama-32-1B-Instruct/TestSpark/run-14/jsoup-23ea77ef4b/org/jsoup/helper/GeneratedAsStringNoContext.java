package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedAsStringNoContext {

    public static Document fromJsoup(String html) {
        return neworg.jsoup.helper.W3CDom.Converter.fromJsoup(html);
    }

    @Test
    public void asStringNoContext() {
        Document soupDoc = fromJsoup("<html><body>Hello World!</body></html>");
        Document domDoc = new W3CDom().Converter.convert(soupDoc, null);
        System.out.println(domDoc.toString());
        return null;
    }

}