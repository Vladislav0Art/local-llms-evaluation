package org.jsoup.helper;

public class GeneratedTestContextNode {

    @Test
    public void testContextNode() {
        Document document = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Document jsoupDoc = W3CDom.fromJsoup(document);
        org.jsoup.nodes.Document contextNode = W3CDom.contextNode(document);
        assertEquals(document.getDocumentElement(), contextNode.getParent());
    }

}