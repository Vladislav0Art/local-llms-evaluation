package org.jsoup.nodes;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document.outerHtml());
    }

}