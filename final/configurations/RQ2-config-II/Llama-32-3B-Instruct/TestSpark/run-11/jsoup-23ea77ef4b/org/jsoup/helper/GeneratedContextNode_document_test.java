package org.jsoup.helper;

public class GeneratedContextNode_document_test {

    @Test
    public void contextNode_document_test() {
        Document wDoc = createDocument();
        Node contextNode = W3CDom.contextNode(wDoc);
        assertTrue(contextNode instanceof Element);
    }

}