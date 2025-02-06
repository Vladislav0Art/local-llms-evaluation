package org.jsoup.nodes;

public class GeneratedDocumentShouldBeCreatedFromShell {

    @Test
    public void documentShouldBeCreatedFromShell() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

}