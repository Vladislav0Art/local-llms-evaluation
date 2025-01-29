package org.jsoup.nodes;

public class GeneratedTestDocumentType {

    @Test
    public void testDocumentType() {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        DocumentType documentType = document.documentType();
        assertEquals(0, documentType == null ? 1 : (int) documentType);
    }

}