package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedSelectXpath {

    @Test
    public void selectXpath() throws Exception {
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>", "file:///path/to/file.html");
        java.util.List<org.jsoup.nodes.Element> nodeList = W3CDom.selectXpath("body", doc);
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getNodes());
        }
    }

}