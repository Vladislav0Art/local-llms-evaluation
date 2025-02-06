package org.jsoup.nodes;

public class GeneratedCreateShellDocument_WithBaseUri_ReturnsDocument {

    @Test
    public void createShellDocument_WithBaseUri_ReturnsDocument() {
        Document document = Document.createShell("https://example.com", "base uri");
        assertNotNull(document);
    }

}