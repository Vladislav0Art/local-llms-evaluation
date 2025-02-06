package org.jsoup.helper;

public class GeneratedFromJsoup_document_test {

    @Test
    public void fromJsoup_document_test() throws Exception {
        Document jsDoc = createDocument();
        Document result = W3CDom.fromJsoup(jsDoc);
        assertNotNull(result);
        assertTrue(result.getDocument().getNamespaceURI().equals(jsDoc.getDocument().getNamespaceURI()));
    }

}