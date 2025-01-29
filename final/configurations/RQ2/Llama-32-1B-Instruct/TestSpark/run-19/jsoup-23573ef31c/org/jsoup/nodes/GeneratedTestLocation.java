package org.jsoup.nodes;

public class GeneratedTestLocation {

    @Test
    public void testLocation() {
        Document document = new Document("https://example.com");
        assertEquals("https://example.com", document.location());
    }

}