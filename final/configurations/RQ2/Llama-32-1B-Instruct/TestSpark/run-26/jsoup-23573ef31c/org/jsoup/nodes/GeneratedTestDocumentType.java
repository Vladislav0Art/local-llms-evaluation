package org.jsoup.nodes;

public class GeneratedTestDocumentType {

    @Test
    public void testDocumentType() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        DocumentType documentType = document.documentType();
        assertEquals("application/x-javascript", documentType.getType());
    }

}