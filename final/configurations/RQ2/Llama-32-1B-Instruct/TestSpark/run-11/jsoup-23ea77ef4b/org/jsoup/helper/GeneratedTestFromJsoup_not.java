package org.jsoup.helper;

public class GeneratedTestFromJsoup_not {

    @Test
    public void testFromJsoup_not() {
        Document document = new org.jsoup.nodes.Document();
        org.jsoup.nodes.Document jsoupDoc = W3CDom.fromJsoup(document);
        assertThrows(DOMException.class, () -> jsoupDoc.getParent());
    }

}