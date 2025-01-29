package org.jsoup.nodes;

public class GeneratedTestDocumentType {

    private Document document;
    private Connection connection;

    @Before
    public void setup() {
        // Create a new document
        document = Document.createShell("https://example.com");
        connection = document.connection();
    }

    @Test
    public void testDocumentType() {
        DocumentType documentType = document.documentType();
        assertNotSame(null, documentType);
    }

}