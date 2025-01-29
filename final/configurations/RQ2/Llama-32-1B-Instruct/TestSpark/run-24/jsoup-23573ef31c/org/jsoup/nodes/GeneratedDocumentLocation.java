package org.jsoup.nodes;

public class GeneratedDocumentLocation {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void documentLocation() throws Exception {
        Document doc = createDocument(BASE_URI);
        assertEquals("http://example.com/", doc.location());
    }

}