package org.jsoup.nodes;

public class GeneratedTestDocumentType {

    private Document document;

    @Before
    void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testDocumentType() {
        Document document2 = document.createShell("https://example.com");
        assertEquals(document.documentType(), document2.documentType());
    }

}