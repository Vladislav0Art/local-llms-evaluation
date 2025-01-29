package org.jsoup.nodes;

public class GeneratedTestElementCreation {

    @Test
    public void testElementCreation() {
        Document document = new Document("https://example.com");
        assertNotNull(document.createElement("h1"));
        assertEquals("h1", document.createElement("h1").tagName());
    }

}