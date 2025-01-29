package org.jsoup.nodes;

public class GeneratedTestCreateShell {

    @Test
    public void testCreateShell() throws Exception {
        String baseUri = "http://example.com";
        Document document = new DocumentDocument(baseUri);
        assertEquals("http://example.com", document.location());
    }

}