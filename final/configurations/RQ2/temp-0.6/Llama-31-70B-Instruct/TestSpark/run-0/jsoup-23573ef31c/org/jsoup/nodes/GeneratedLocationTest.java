package org.jsoup.nodes;

public class GeneratedLocationTest {

    private Document document;

    @Test
    public void locationTest() {
        document = new Document("http://www.example.com");
        assertEquals("http://www.example.com", document.location());
    }

}