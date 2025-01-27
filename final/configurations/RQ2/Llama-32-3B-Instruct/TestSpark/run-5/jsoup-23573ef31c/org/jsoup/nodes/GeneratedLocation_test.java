package org.jsoup.nodes;

public class GeneratedLocation_test {

    @Test
    public void location_test() {
        Document document = new Document("http://example.com");
        assertNotNull(document.location());
    }

}