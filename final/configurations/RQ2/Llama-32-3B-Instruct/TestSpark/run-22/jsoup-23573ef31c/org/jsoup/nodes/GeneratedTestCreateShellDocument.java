package org.jsoup.nodes;

public class GeneratedTestCreateShellDocument {

    @Test
    public void testCreateShellDocument() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertNotNull(document);
        assertTrue(document instanceof Document);
    }

}