package org.jsoup.helper;

public class GeneratedContextNodeDocumentReturnsNode {

    @Test
    public void contextNodeDocumentReturnsNode() {
        Document wDoc = new Document();
        Node result = W3CDom.contextNode(wDoc);
        assertNotNull(result);
    }

}