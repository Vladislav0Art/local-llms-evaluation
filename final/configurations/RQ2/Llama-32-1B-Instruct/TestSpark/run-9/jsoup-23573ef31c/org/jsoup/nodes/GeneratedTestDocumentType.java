package org.jsoup.nodes;

public class GeneratedTestDocumentType {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testDocumentType() {
        DocumentType documentType = document.documentType();
        assertEquals("text/html", documentType.getType());
    }

}