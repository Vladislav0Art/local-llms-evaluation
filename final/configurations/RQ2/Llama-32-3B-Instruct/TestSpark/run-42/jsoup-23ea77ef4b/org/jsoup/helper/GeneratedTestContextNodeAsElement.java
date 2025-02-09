package org.jsoup.helper;

public class GeneratedTestContextNodeAsElement {

    @Test
    public void testContextNodeAsElement() {
        Document wDoc = new org.jsoup.nodes.Document();
        Element element = wDoc.createElement("div");
        wDoc.appendChild(element);
        Node contextNode = W3CDom.contextNode(wDoc);
        assertTrue(contextNode instanceof org.jsoup.nodes.Element);
    }

}