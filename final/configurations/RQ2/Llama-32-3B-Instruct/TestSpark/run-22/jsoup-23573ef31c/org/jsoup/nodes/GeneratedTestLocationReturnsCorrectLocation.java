package org.jsoup.nodes;

public class GeneratedTestLocationReturnsCorrectLocation {

    @Test
    public void testLocationReturnsCorrectLocation() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertEquals(baseUri, document.location());
    }

}