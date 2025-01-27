package org.jsoup.nodes;

public class GeneratedTestOuterHtmlReturnsCorrectOuterHTML {

    @Test
    public void testOuterHtmlReturnsCorrectOuterHTML() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = new Document("https://example.com");
        document.setHTML(html);
        assertEquals(html, document.getOuterHTML());
    }

}