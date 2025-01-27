package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createShell_documentCreatedWithCorrectUri() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.location());
    }

    @Test
    public void location_returnsCorrectUri() {
        Document document = new Document("https://example.com");
        assertEquals("https://example.com", document.location());
    }

    @Test
    public void title_setsAndGetsCorrectTitle() {
        String title = "Example Title";
        Document document = new Document("https://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void outerHtml_returnsOuterHTMLContent() {
        String htmlContent = "<html>Example HTML Content</html>";
        Document document = Jsoup.parse(htmlContent, "UTF-8", null);
        assertEquals(htmlContent, document.outerHtml());
    }

}