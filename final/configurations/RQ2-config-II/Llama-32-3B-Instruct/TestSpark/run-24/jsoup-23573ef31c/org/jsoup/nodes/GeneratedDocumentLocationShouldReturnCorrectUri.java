package org.jsoup.nodes;

public class GeneratedDocumentLocationShouldReturnCorrectUri {

    @Test
    public void documentLocationShouldReturnCorrectUri() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.location());
    }

}