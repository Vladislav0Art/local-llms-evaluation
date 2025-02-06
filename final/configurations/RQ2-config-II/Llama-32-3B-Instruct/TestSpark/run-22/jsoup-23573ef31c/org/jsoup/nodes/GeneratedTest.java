package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createShellDocument_ReturnsDocument() {
        Document document = Document.createShell("https://example.com");
        assertNotNull(document);
    }

    @Test
    public void createShellDocument_WithBaseUri_ReturnsDocument() {
        Document document = Document.createShell("https://example.com", "base uri");
        assertNotNull(document);
    }

    @Test
    public void location_DocumentHasCorrectLocation() {
        Document document = new Document("https://example.com");
        assertEquals("https://example.com", document.location());
    }

    @Test
    public void connection_DocumentHasCorrectConnection() {
        Connection connection = mock(Connection.class);
        when(connection.getConnection()).thenReturn(true);
        Document document = new Document("https://example.com");
        assertEquals(connection, document.connection());
    }

    @Test
    public void documentType_DocumentReturnsNullDocumentType() {
        Document document = new Document("https://example.com");
        assertNull(document.documentType());
    }

    @Test
    public void head_DocumentHasCorrectHeadElement() {
        Document document = new Document("https://example.com");
        Element head = document.head();
        assertNotNull(head);
    }

    @Test
    public void body_DocumentHasCorrectBodyElement() {
        Document document = new Document("https://example.com");
        Element body = document.body();
        assertNotNull(body);
    }

    @Test
    public void forms_DocumentReturnsEmptyList() {
        Document document = new Document("https://example.com");
        assertTrue(document.forms().isEmpty());
    }

    @Test
    public void expectForm_DocumentReturnsExpectedFormElement() {
        FormElement form = mock(FormElement.class);
        when(form.getCssQuery()).thenReturn("css query");
        Document document = new Document("https://example.com");
        assertEquals(form, document.expectForm("css query"));
    }

    @Test
    public void title_DocumentHasCorrectTitle() {
        Document document = new Document("https://example.com");
        String title = document.title();
        assertNotNull(title);
    }

    @Test
    public void createElement_DocumentCreatesNewElement() {
        Element element = Document.createElement("element");
        assertNotNull(element);
    }

    @Test
    public void outerHtml_DocumentReturnsOuterHtml() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = new Document("https://example.com");
        assertEquals(html, document.outerHtml());
    }

    @Test
    public void text_DocumentSetsText() {
        Document document = new Document("https://example.com");
        document.text("Hello World!");
        assertEquals("Hello World!", document.text());
    }

    @Test
    public void nodeName_DocumentReturnsNodeName() {
        String nodeName = "element";
        Element element = mock(Element.class);
        when(element.getNodeName()).thenReturn(nodeName);
        Document document = new Document("https://example.com");
        assertEquals(nodeName, document.nodeName());
    }

    @Test
    public void charset_DocumentSetsCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document("https://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElement_DocumentUpdatesCharset() {
        boolean updated = false;
        when(DataUtil.getCharset()).thenReturn(Charset.forName("UTF-8"));
        Document document = new Document("https://example.com");
        document.updateMetaCharsetElement(true);
        assertTrue(updated);
    }

    @Test
    public void outputSettings_DocumentReturnsOutputSettings() {
        OutputSettings settings = mock(OutputSettings.class);
        when(parser().outputSettings()).thenReturn(settings);
        Document document = new Document("https://example.com");
        assertEquals(settings, document.outputSettings());
    }

    @Test
    public void quirksMode_DocumentSetsQuirksMode() {
        QuirksMode mode = QuirksMode.CONSERVATIVE;
        Document document = new Document("https://example.com");
        document.quirksMode(mode);
        assertEquals(mode, document.quirksMode());
    }

    @Test
    public void shallowClone_DocumentCreatesShallowClone() {
        Document document = new Document("https://example.com");
        Document clone = document.shallowClone();
        assertNotNull(clone);
    }

}