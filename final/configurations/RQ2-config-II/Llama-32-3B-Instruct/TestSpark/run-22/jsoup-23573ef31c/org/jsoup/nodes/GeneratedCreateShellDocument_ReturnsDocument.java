package org.jsoup.nodes;

public class GeneratedCreateShellDocument_ReturnsDocument {

    @Test
    public void createShellDocument_ReturnsDocument() {
        Document document = Document.createShell("https://example.com");
        assertNotNull(document);
    }

}