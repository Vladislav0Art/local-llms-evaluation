package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class GeneratedAsStringNoContextType {

    public static Document fromJsoup(String html) {
        return neworg.jsoup.helper.W3CDom.Converter.fromJsoup(html);
    }

    @Test
    public void asStringNoContextType() {
        Document soupDoc = fromJsoup("<html><body>Hello World!</body></html>");
        Document domDoc = new W3CDom().Converter.convert(soupDoc, null);
        String string = (String) domDoc.toString();
        System.out.println(string);
    }
}

}