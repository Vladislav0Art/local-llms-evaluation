package org.jsoup.nodes;

public class GeneratedOuterHtmlShouldReturnCorrectString {

    @Test
    public void outerHtmlShouldReturnCorrectString() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        String outerHtml = document.outerHtml();
        assertNotNull(outerHtml);
    }

}