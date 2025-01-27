package org.jsoup.nodes;

public class GeneratedTest {

    private Document document;

    @Before
    public void setUp() {
        document = new Document();
    }

    @Test
    public void testCreateShellDocument() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
        assertTrue(document instanceof Document);
    }

    @Test
    public void testLocationReturnsCorrectLocation() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.location());
    }

    @Test
    public void testTitleSetsTitleCorrectly() {
        String originalTitle = "Original Title";
        Document document = Document.createShell("https://example.com");
        document.title(originalTitle);
        assertEquals(originalTitle, document.title());
    }

    @Test
    public void testOuterHtmlReturnsCorrectOuterHTML() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Document.createShell("https://example.com");
        document.html(html);
        assertEquals(html, document.outerHtml());
    }

    @Test
    public void testTextSetsTextCorrectly() {
        String originalText = "Hello World!";
        Document document = Document.createShell("https://example.com");
        document.text(originalText);
        assertEquals(originalText, document.text());
    }

    @Test
    public void testCharsetSetsCharsetCorrectly() {
        Charset originalCharset = Charset.forName("UTF-8");
        Document document = Document.createShell("https://example.com");
        document.charset(originalCharset);
        assertNotNull(document.charset());
        assertEquals(originalCharset, document.charset());
    }

    @Test
    public void testUpdateMetaCharsetElementUpdatesCharsetCorrectly() {
        boolean originalUpdate = true;
        Document document = Document.createShell("https://example.com");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
        assertEquals(originalUpdate, document.updateMetaCharsetElement());
    }

    @Test
    public void testCloneCreatesNewDocument() {
        String baseUri = "https://example.com";
        Document originalDocument = Document.createShell(baseUri);
        Document clonedDocument = originalDocument.clone();
        assertNotNull(clonedDocument);
        assertTrue(clonedDocument instanceof Document);
    }

    @Test
    public void testShallowCloneCreatesShallowCopyOfOriginalDocument() {
        String baseUri = "https://example.com";
        Document originalDocument = Document.createShell(baseUri);
        Document shallowClonedDocument = originalDocument.shallowClone();
        assertNotNull(shallowClonedDocument);
        assertTrue(shallowClonedDocument instanceof Document);
    }

}