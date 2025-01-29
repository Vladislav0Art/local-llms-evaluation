package org.jsoup.nodes;

public class GeneratedDocumentShallowClone {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void documentShallowClone() throws Exception {
        Document doc1 = createDocument(BASE_URI);
        Document doc2 = doc1.shallowClone();
        assertEquals(doc1, doc2);
    }

}