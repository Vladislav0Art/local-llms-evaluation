package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testCreateShell() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

    @Test
    public void testLocation() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertEquals("https://example.com", document.location());
    }

    @Test
    public void testConnection() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertNotNull(document.connection());
    }

    @Test
    public void testDocumentType() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertEquals(Document.DocumentType.HTML5, document.documentType());
    }

    @Test
    public void testHead() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertNotNull(document.head());
    }

    @Test
    public void testBody() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertNotNull(document.body());
    }

    @Test
    public void testForms() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        List<FormElement> forms = document.forms();
        assertEquals(5, forms.size());
    }

    @Test
    public void testExpectForm() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        FormElement form = document.expectForm("test");
        assertNotNull(form);
    }

    @Test
    public void testTitle() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertEquals("Example", document.title());
    }

    @Test
    public void testTitleSetter() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

    @Test
    public void testElementCreation() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        assertNotNull(document.createElement("h1"));
    }

}