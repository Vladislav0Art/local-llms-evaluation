package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedNamespaceAwareMapWithBool {

    @Test
    public void namespaceAwareMapWithBool() throws Exception {
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>", "file:///path/to/file.html");
        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("key", "value");
        Document doc2 = Jsoup.parse("<html><body>" + doc.toString() + "</body></html>", "file:///path/to/file.html");
        W3CDom.W3CDom namespaceAware = new W3CDom();
        System.out.println(namespaceAware.namespaceAware(true).namespaceAware(map.get("key")));
    }

}