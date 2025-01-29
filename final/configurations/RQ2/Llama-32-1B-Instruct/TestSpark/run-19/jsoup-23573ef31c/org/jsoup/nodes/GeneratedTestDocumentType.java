package org.jsoup.nodes;

public class GeneratedTestDocumentType {

    @Test
    public void testDocumentType() {
        Document document = createShell("https://example.com");
        assertNotNull(document.documentType());
    }

}