package org.jsoup.nodes;

public class GeneratedTestDocumentType_Simple {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testDocumentType_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        assertEquals(Document.DocumentType.CURRENT, document.documentType());
    }

}