package org.jsoup.nodes;

public class GeneratedTest_outerHtml {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void test_outerHtml() {
        Document document = new Document(BASE_URI);
        String html = "<html><body>Hello World!</body></html>";
        Document outputDocument = document.outerHtml(html);
        assertEquals("<html><body>Hello World!</body></html>", outputDocument.outerHtml());
    }

}