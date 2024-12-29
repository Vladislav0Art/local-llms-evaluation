package org.jsoup.nodes;

public class GeneratedTestLocation {

    @Test
    public void testLocation() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertEquals("https://example.com", document.location());
    }

}