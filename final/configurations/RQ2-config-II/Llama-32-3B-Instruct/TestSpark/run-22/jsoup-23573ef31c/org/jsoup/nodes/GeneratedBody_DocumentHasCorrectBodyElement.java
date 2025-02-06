package org.jsoup.nodes;

public class GeneratedBody_DocumentHasCorrectBodyElement {

    @Test
    public void body_DocumentHasCorrectBodyElement() {
        Document document = new Document("https://example.com");
        Element body = document.body();
        assertNotNull(body);
    }

}