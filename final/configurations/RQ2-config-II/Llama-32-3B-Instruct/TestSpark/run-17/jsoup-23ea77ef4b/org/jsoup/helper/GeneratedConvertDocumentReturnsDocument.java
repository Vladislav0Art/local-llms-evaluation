package org.jsoup.helper;

public class GeneratedConvertDocumentReturnsDocument {

    @Test
    public void convertDocumentReturnsDocument() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Document doc = W3CDom.convert(in);
        assertNotNull(doc);
    }

}