package org.jsoup.nodes;

public class GeneratedDocumentTypeTest {

    private Document document;

    @Test
    public void documentTypeTest() {
        document = new Document("http://www.example.com");
        assertNull(document.documentType());
    }

}