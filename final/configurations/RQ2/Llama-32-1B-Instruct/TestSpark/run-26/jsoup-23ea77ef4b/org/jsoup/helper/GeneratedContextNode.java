package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedContextNode {

    @Test
    public void contextNode() throws Exception {
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>", "file:///path/to/file.html");
        org.jsoup.nodes.Element element = W3CDom.contextNode(doc);
        System.out.println(element);
    }

}