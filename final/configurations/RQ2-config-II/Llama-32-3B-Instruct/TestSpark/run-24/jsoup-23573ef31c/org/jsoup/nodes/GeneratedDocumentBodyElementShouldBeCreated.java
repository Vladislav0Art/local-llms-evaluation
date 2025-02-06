package org.jsoup.nodes;

public class GeneratedDocumentBodyElementShouldBeCreated {

    @Test
    public void documentBodyElementShouldBeCreated() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        Element body = document.body();
        assertTrue(body != null);
        assertEquals("body", body.nodeName());
    }

}