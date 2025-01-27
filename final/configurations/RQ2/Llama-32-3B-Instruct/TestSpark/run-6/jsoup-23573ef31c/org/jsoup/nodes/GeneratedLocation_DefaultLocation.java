package org.jsoup.nodes;

public class GeneratedLocation_DefaultLocation {

    @Test
    public void location_DefaultLocation() {
        String url = "http://example.com";
        Document document = new Document(url);
        assertEquals(url, document.location());
    }

}