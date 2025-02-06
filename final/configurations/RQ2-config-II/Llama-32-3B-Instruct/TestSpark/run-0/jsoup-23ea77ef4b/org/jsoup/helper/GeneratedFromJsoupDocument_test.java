package org.jsoup.helper;

public class GeneratedFromJsoupDocument_test {

    private static final Document DOC = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

    @Test
    public void fromJsoupDocument_test() {
        org.jsoup.nodes.Document jsoupDoc = new org.jsoup.nodes.Document();
        Document expectedDoc = DOC;
        Document actualDoc = W3CDom.fromJsoup(jsoupDoc);
        assertEquals(expectedDoc, actualDoc);
    }

}