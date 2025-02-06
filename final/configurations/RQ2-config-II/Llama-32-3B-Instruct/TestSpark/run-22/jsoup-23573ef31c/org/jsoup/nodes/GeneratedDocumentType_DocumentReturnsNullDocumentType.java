package org.jsoup.nodes;

public class GeneratedDocumentType_DocumentReturnsNullDocumentType {

    @Test
    public void documentType_DocumentReturnsNullDocumentType() {
        Document document = new Document("https://example.com");
        assertNull(document.documentType());
    }

}