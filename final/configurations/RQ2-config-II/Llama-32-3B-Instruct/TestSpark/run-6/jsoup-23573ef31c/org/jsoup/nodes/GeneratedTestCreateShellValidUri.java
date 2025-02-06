package org.jsoup.nodes;

public class GeneratedTestCreateShellValidUri {

    @Test
    public void testCreateShellValidUri() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

}