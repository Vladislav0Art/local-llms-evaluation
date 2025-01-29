package org.jsoup.nodes;

public class GeneratedTestLocation {

    @Test
    public void testLocation() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        assertEquals("http://example.com", document.location());
    }

}