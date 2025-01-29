package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testDocumentConstructor() throws Exception {
        Document document = new Document("https://www.example.com");
        assertNotNull(document);
        assertEquals("https://www.example.com", document.location());
        assertNotEquals(null, document.connection());
    }

    @Test
    public void testDocumentType() {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        DocumentType documentType = document.documentType();
        assertEquals(0, documentType == null ? 1 : (int) documentType);
    }

    @Test
    public void testHeadElement() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        Element head = document.head();
        assertNotNull(head);
        assertEquals("html", head.nodeName());
    }

    @Test
    public void testBodyElement() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        Element body = document.body();
        assertNotNull(body);
        assertEquals("html", body.nodeName());
    }

    @Test
    public void testFormsElement() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
    }

    @Test
    public void testExpectFormElement() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        FormElement expectForm = document.expectForm("css");
        assertNotNull(expectForm);
        assertEquals("css", expectForm.cssQuery());
    }

    @Test
    public void testTitle() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        String title = document.title();
        assertEquals("Example Page", title);
    }

    @Test
    public void testTitleMethod() throws Exception {
        String baseUri = "https://example.com";
        Document document = createShell(baseUri);
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

}