package org.jsoup.helper;

public class GeneratedTestConvert {

    @Test
    public void testConvert() {
        Document document = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Document jsoupDoc = W3CDom.fromJsoup(document);
        W3CDom.convert(document, jsoupDoc);
        org.jsoup.nodes.Document convertedDocument = W3CDom.fromJsoup(document);
        assertEquals(jsoupDoc, convertedDocument);
    }

}