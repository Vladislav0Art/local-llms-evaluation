package org.jsoup.nodes;

public class GeneratedTestLocationReturnsNullDocumentEmpty {

    @Test
    public void testLocationReturnsNullDocumentEmpty() {
        Document document = new Document("https://example.com");
        assertNull(document.location());
    }

}