package org.jsoup.nodes;

public class GeneratedBodyTest {

    @Test
    public void bodyTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document.body());
    }

}