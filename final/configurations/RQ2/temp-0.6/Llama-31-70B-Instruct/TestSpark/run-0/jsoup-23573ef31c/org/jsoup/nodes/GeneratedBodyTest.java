package org.jsoup.nodes;

public class GeneratedBodyTest {

    private Document document;

    @Test
    public void bodyTest() {
        document = new Document("http://www.example.com");
        assertNotNull(document.body());
    }

}