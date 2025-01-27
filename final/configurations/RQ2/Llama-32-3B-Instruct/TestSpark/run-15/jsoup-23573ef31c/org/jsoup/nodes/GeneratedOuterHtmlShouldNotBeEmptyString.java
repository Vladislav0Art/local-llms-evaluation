package org.jsoup.nodes;

public class GeneratedOuterHtmlShouldNotBeEmptyString {

    @Test
    public void outerHtmlShouldNotBeEmptyString() {
        Document document = Document.createShell("https://example.com");
        String html = document.outerHtml();
        assertFalse(html.isEmpty());
    }

}