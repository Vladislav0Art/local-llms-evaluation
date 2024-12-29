package org.jsoup.nodes;

public class GeneratedTestDocumentType {

    @Test
    public void testDocumentType() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertEquals(Document.DocumentType.HTML5, document.documentType());
    }

}