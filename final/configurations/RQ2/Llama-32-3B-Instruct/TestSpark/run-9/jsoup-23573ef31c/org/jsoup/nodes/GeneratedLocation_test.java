package org.jsoup.nodes;

public class GeneratedLocation_test {

    @Test
    public void location_test() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        assertEquals(baseUri, document.location());
    }

}