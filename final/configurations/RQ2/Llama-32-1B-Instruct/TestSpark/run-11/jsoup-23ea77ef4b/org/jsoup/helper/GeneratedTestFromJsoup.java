package org.jsoup.helper;

public class GeneratedTestFromJsoup {

    @Test
    public void testFromJsoup() {
        Document document = W3CDom.createDocument();
        org.jsoup.nodes.Document jsoupDoc = W3CDom.fromJsoup(document);
        assertEquals(document, jsoupDoc);
    }

}