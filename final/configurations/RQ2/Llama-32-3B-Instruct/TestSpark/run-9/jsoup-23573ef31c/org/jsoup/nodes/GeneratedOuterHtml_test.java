package org.jsoup.nodes;

public class GeneratedOuterHtml_test {

    @Test
    public void outerHtml_test() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = new Document("http://example.com");
        document.append(html);
        assertTrue(document.outerHtml().contains(html));
    }

}