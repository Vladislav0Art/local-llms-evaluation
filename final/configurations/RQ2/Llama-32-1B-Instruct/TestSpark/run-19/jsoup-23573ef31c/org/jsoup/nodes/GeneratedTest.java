package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testDocumentConstructor() {
        Document document = new Document("https://example.com");
        assertEquals(document, document);
    }

    @Test
    public void testCreateShell() {
        Document document = createShell("https://example.com");
        assertEquals(document, document);
    }

    @Test
    public void testLocation() {
        Document document = new Document("https://example.com");
        assertEquals("https://example.com", document.location());
    }

    @Test
    public void testConnection() {
        Connection connection = new Connection("https://example.com");
        Document document = new Document(connection);
        assertEquals(document, document.connection());
    }

    @Test
    public void testDocumentType() {
        Document document = createShell("https://example.com");
        assertNotNull(document.documentType());
    }

    @Test
    public void testHead() {
        Document document = new Document("https://example.com");
        assertNotNull(document.head());
        assertEquals(0, document.head().children().size());
    }

    @Test
    public void testBody() {
        Document document = new Document("https://example.com");
        assertNotNull(document.body());
        assertEquals(0, document.body().children().size());
    }

    @Test
    public void testForms() {
        Document document = new Document("https://example.com");
        List<FormElement> forms = document.forms();
        assertEquals(1, forms.size());
        assertEquals(0, forms.get(0).childCount());
    }

    @Test
    public void testExpectForm() {
        Document document = createShell("https://example.com");
        FormElement form = document.expectForm("#myForm");
        assertNotNull(form);
        assertEquals("#myForm", form.tagName());
    }

    @Test
    public void testTitle() {
        Document document = new Document("https://example.com");
        assertEquals("title", document.title());
    }

    @Test
    public void testTitleMethodCall() {
        Document document = new Document("https://example.com");
        document.title("newTitle");
        assertEquals("newTitle", document.title());
    }

    @Test
    public void testElementCreation() {
        Document document = new Document("https://example.com");
        assertNotNull(document.createElement("h1"));
        assertEquals("h1", document.createElement("h1").tagName());
    }

    @Test
    public void testCharset() {
        Document document = new Document("https://example.com");
        assertEquals("utf-8", document.charset().toString());
    }

    @Test
    public void testUpdateMetaCharsetElement() {
        Document document = new Document("https://example.com");
        assertNotNull(document.updateMetaCharsetElement(true));
        assertEquals(true, document.updateMetaCharsetElement());
    }

    @Test
    public void testUpdateMetaCharsetElementMethodCall() {
        Document document = new Document("https://example.com");
        document.updateMetaCharsetElement();
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void testShallowClone() {
        Document document1 = new Document("https://example.com");
        Document document2 = document1.shallowClone();
        assertEquals(document1, document2);
    }

    @Test
    public void testOutputSettings() {
        Document document = new Document("https://example.com");
        assertEquals("", document.outputSettings().toString());
        document.outputSettings(new OutputSettings());
        assertEquals("<style>body { background-color: #f2f2f2; }</style>", document.outputSettings().toString());
    }

    @Test
    public void testOutputSettingsMethodCall() {
        Document document = new Document("https://example.com");
        assertNotNull(document.outputSettings());
        document.outputSettings(new OutputSettings());
    }

    @Test
    public void testQuirksMode() {
        Document document = new Document("https://example.com");
        assertEquals(0, document.quirksMode().toString().length());
    }

    @Test
    public void testQuirksModeMethodCall() {
        Document document = new Document("https://example.com");
        assertNotNull(document.quirksMode());
        document.quirksMode(new QuirksMode());
    }

}