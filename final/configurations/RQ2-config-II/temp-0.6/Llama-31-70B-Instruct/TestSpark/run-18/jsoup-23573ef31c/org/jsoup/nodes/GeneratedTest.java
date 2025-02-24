package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.baseUri());
    }

    @Test
    public void locationTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.location());
    }

    @Test
    public void headTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document.head());
    }

    @Test
    public void bodyTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document.body());
    }

    @Test
    public void titleTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        String title = "Title";
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void outerHtmlTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document.outerHtml());
    }

    @Test
    public void textTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        String text = "Text";
        document.text(text);
        assertEquals(text, document.text());
    }

    @Test
    public void nodeNameTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals("#document", document.nodeName());
    }

}