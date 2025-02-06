package org.jsoup.helper;

public class GeneratedFromJsoupElement_test {

    private static final Document DOC = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

    @Test
    public void fromJsoupElement_test() {
        org.jsoup.nodes.Element jsoupElement = new org.jsoup.nodes.Element();
        Document expectedDoc = DOC;
        Document actualDoc = W3CDom.fromJsoup(jsoupElement);
        assertEquals(expectedDoc, actualDoc);
    }

}