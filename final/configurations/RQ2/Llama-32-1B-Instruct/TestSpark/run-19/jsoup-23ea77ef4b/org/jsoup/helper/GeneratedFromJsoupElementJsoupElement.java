package org.jsoup.helper;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.NodeList;

public class GeneratedFromJsoupElementJsoupElement {

    @Test
    public void fromJsoupElementJsoupElement() {
        Document doc = new Document();
        Node node = document(doc).select("test").first();
        W3CDom.fromJsoup(doc, node);
    }

}