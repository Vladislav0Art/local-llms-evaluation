package org.jsoup.nodes;

public class GeneratedBodyShouldNotBeNull {

    @Test
    public void bodyShouldNotBeNull() {
        Document document = Document.createShell("https://example.com");
        Element body = document.body();
        assertNotNull(body);
    }

}