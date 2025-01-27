package org.jsoup.nodes;

public class GeneratedLocation_SetLocation {

    @Test
    public void location_SetLocation() {
        String url = "http://localhost:8080";
        Document document = new Document();
        document.location(url);
        assertEquals(url, document.location());
    }
}

}