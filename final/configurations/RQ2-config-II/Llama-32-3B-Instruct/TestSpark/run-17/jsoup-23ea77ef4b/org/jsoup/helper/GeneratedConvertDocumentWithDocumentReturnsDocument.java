package org.jsoup.helper;

public class GeneratedConvertDocumentWithDocumentReturnsDocument {

    @Test
    public void convertDocumentWithDocumentReturnsDocument() {
        org.jsoup.nodes.Document in = new org.jsoup.nodes.Document();
        Document out = new Document();
        W3CDom.convert(in, out);
        assertEquals(1, out.getDocument().getDocumentElement().getNodeType());
    }

}