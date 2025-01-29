package org.jsoup.helper;

public class GeneratedContextNode {

    private org.jsoup.helper.W3CDom w3cdom;

    @Test
    public void contextNode() {
        org.jsoup.nodes.Document doc = org.jsoup.nodes.Document.parse("<html><body>Hello World!</body></html>");
        org.jsoup.helper.W3CDom w3cdom = new org.jsoup.helper.W3CDom();
        DocumentContext context = w3cdom.contextNode(doc);
        Assertions.assertEquals(doc, context.getCurrentDocument());
    }

}