package org.jsoup.nodes;

public class GeneratedOuterHtml_test {

    @Test
    public void outerHtml_test() {
        Document document = new Document("http://example.com");
        String html = document.outerHtml();
        assertNotNull(html);
    }

}