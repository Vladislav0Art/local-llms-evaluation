package org.jsoup.nodes;

public class GeneratedOuterHtmlMethod_ReturnsStringValue {

    @Test
    public void outerHtmlMethod_ReturnsStringValue() {
        String html = "<html><body>Hello World!</body></html>";
        Document doc = Jsoup.parse(html);
        String outerHtml = doc.outerHtml();
        assertNotNull(outerHtml);
        assertTrue(!outerHtml.isEmpty());
    }

}