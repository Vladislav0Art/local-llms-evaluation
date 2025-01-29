package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void namespaceAware() throws Exception {
        Document doc = Jsoup.parse("html, body");
        System.out.println(doc.namespaceAware());
    }

    @Test
    public void namespaceAwareWithBool() throws Exception {
        Document doc = Jsoup.parse("<html><body></body></html>", "file:///path/to/file.html");
        W3CDom.W3CDom namespaceAware = new W3CDom();
        System.out.println(namespaceAware.namespaceAware(true));
    }

    @Test
    public void namespaceAwareMap() throws Exception {
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>", "file:///path/to/file.html");
        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("key", "value");
        Document doc2 = Jsoup.parse("<html><body>" + doc.toString() + "</body></html>", "file:///path/to/file.html");
        System.out.println(doc2.namespaceAware(true).namespaceAware(map.get("key")));
    }

    @Test
    public void namespaceAwareMapWithBool() throws Exception {
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>", "file:///path/to/file.html");
        java.util.HashMap<String, String> map = new java.util.HashMap<>();
        map.put("key", "value");
        Document doc2 = Jsoup.parse("<html><body>" + doc.toString() + "</body></html>", "file:///path/to/file.html");
        W3CDom.W3CDom namespaceAware = new W3CDom();
        System.out.println(namespaceAware.namespaceAware(true).namespaceAware(map.get("key")));
    }

    @Test
    public void selectXpath() throws Exception {
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>", "file:///path/to/file.html");
        java.util.List<org.jsoup.nodes.Element> nodeList = W3CDom.selectXpath("body", doc);
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getNodes());
        }
    }

    @Test
    public void selectXpathWithContextNode() throws Exception {
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>", "file:///path/to/file.html");
        java.util.List<org.jsoup.nodes.Element> nodeList = W3CDom.selectXpath("body", doc, new org.jsoup.nodes.Element(null));
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getNodes());
        }
    }

    @Test
    public void contextNode() throws Exception {
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>", "file:///path/to/file.html");
        org.jsoup.nodes.Element element = W3CDom.contextNode(doc);
        System.out.println(element);
    }

    @Test
    public void asString() throws Exception {
        Document doc = Jsoup.parse("<html><body>Hello, World!</body></html>", "file:///path/to/file.html");
        java.util.StringBuilder string = new java.util.StringBuilder();
        W3CDom.asString(doc, string);
        System.out.println(string.toString());
    }

}