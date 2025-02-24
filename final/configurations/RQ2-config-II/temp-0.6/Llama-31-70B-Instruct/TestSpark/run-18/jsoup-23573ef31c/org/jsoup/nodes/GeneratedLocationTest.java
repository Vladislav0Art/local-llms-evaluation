package org.jsoup.nodes;

public class GeneratedLocationTest {

    @Test
    public void locationTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.location());
    }

}