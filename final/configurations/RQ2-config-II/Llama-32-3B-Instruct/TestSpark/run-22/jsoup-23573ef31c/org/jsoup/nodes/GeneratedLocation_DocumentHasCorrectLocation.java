package org.jsoup.nodes;

public class GeneratedLocation_DocumentHasCorrectLocation {

    @Test
    public void location_DocumentHasCorrectLocation() {
        Document document = new Document("https://example.com");
        assertEquals("https://example.com", document.location());
    }

}