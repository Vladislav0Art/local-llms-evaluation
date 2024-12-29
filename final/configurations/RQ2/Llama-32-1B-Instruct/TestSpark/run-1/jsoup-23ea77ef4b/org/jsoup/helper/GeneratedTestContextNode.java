package org.jsoup.helper;

public class GeneratedTestContextNode {

    @Test
    public void testContextNode() {
        org.jsoup.nodes.Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File("example.html"));
        W3CDom instance = new W3CDom();
        Element element = document.createElementNS("http://www.w3.org/1999/xhtml", "div");
        instance.contextNode(document, element);
    }

}