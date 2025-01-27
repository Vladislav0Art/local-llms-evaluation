package org.jsoup.nodes;

public class GeneratedDocumentType_test {

    @Test
    public void documentType_test() {
        Document document = new Document("http://example.com");
        assertNotNull(document.documentType());
    }

}