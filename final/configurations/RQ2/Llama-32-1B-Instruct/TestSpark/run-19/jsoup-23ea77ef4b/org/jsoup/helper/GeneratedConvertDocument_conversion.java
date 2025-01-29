package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeList;

public class GeneratedConvertDocument_conversion {

    @Test
    public void convertDocument_conversion() {
        Document doc = new Document();
        String result = W3CDom.convert(doc, null);
        System.out.println(result);
    }

}