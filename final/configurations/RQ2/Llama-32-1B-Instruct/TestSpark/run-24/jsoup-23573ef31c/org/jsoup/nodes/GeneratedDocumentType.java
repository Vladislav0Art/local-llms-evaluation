package org.jsoup.nodes;

public class GeneratedDocumentType {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void documentType() throws Exception {
        Document doc = createDocument(BASE_URI);
        DocumentType type = doc.documentType();
        assertEquals("http://example.com/ XHTML 1.0 Strict", type.href());
    }

}