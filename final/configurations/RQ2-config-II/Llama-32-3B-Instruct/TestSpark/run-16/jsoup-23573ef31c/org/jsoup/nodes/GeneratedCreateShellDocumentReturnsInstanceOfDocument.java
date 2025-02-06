package org.jsoup.nodes;

public class GeneratedCreateShellDocumentReturnsInstanceOfDocument {

    @Test
    public void createShellDocumentReturnsInstanceOfDocument() {
        Document doc = Document.createShell("");
        assertNotNull(doc);
        assertTrue(doc instanceof Document);
    }

}