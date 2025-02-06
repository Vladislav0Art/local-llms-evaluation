package org.jsoup.nodes;

public class GeneratedOuterHtml_DocumentReturnsOuterHtml {

    @Test
    public void outerHtml_DocumentReturnsOuterHtml() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = new Document("https://example.com");
        assertEquals(html, document.outerHtml());
    }

}