package org.jsoup.nodes;

public class GeneratedTestElementCreation {

    @Test
    public void testElementCreation() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertNotNull(document.createElement("h1"));
    }

}