package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void constructor_test() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        assertNotNull(document);
    }

    @Test
    public void createShell_test() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

    @Test
    public void location_test() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        assertEquals(baseUri, document.location());
    }

    @Test
    public void connection_test() {
        Connection connection = mock(Connection.class);
        when(connection.connect()).thenReturn(true);
        Document document = new Document("http://example.com");
        Document document2 = document.connection(connection);
        assertNotNull(document2);
    }

    @Test
    public void title_test() {
        String title = "Example Title";
        Document document = new Document("http://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void createElement_test() {
        String tagName = "input";
        Element element = mock(Element.class);
        when(element.tagName()).thenReturn(tagName);
        Document document = new Document("http://example.com");
        Element createdElement = document.createElement(tagName);
        assertNotNull(createdElement);
        assertEquals(tagName, createdElement.nodeName());
    }

    @Test
    public void outerHtml_test() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = new Document("http://example.com");
        document.append(html);
        assertTrue(document.outerHtml().contains(html));
    }

    @Test
    public void text_test() {
        String text = "Hello World!";
        Document document = new Document("http://example.com");
        Element element = mock(Element.class);
        when(element.nodeName()).thenReturn("");
        document.text(text, element);
        assertEquals(text, element.text());
    }

    @Test
    public void clone_test() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        Document clonedDocument = document.clone();
        assertNotNull(clonedDocument);
        assertEquals(baseUri, clonedDocument.location());
    }

    @Test
    public void shallowClone_test() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        Document clonedDocument = document.shallowClone();
        assertNotNull(clonedDocument);
        assertEquals(baseUri, clonedDocument.location());
    }

    @Test
    public void charset_test() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document("http://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElement_test() {
        boolean update = true;
        Document document = new Document("http://example.com");
        document.updateMetaCharsetElement(update);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void outputSettings_test() {
        OutputSettings outputSettings = mock(OutputSettings.class);
        when(outputSettings.getCharset()).thenReturn(Charset.forName("UTF-8"));
        Document document = new Document("http://example.com");
        Document document2 = document.outputSettings(outputSettings);
        assertNotNull(document2);
        assertEquals(outputSettings.getCharset(), document2.charset());
    }

    @Test
    public void quirksMode_test() {
        QuirksMode quirksMode = mock(QuirksMode.class);
        when(quirksMode.getMode()).thenReturn("quirks");
        Document document = new Document("http://example.com");
        Document document2 = document.quirksMode(quirksMode);
        assertNotNull(document2);
        assertEquals(quirksMode.getMode(), document2.quirksMode());
    }

    @Test
    public void parser_test() {
        Parser parser = mock(Parser.class);
        when(parser.parse()).thenReturn(null);
        Document document = new Document("http://example.com");
        Document document2 = document.parser(parser);
        assertNotNull(document2);
        assertEquals(parser, document2.parser());
    }

}