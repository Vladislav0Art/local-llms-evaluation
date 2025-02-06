package org.jsoup.helper;

public class GeneratedFromJsoupDocumentReturnsDocument {

    @Test
    public void fromJsoupDocumentReturnsDocument() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Document doc = W3CDom.fromJsoup(in);
        assertNotNull(doc);
    }

}