package org.jsoup.nodes;

public class GeneratedCreateShellShouldReturnDocument {

    @Test
    public void createShellShouldReturnDocument() {
        Document document = Document.createShell("https://example.com");
        assertNotNull(document);
    }

}