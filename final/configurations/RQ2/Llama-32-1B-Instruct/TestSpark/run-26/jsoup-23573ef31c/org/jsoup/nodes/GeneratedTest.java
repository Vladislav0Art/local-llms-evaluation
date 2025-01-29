package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testLocation() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void testConnection() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        Connection connection = document.connection();
        assertNotNull(connection);
        assertNotSame("", connection.getURI());
    }

    @Test
    public void testDocumentType() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        DocumentType documentType = document.documentType();
        assertEquals("application/x-javascript", documentType.getType());
    }

    @Test
    public void testHeadElement() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        Element head = document.head();
        assertNotNull(head);
        assertEquals("head", head.nodeName());
    }

    @Test
    public void testBodyElement() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        Element body = document.body();
        assertNotNull(body);
        assertEquals("body", body.nodeName());
    }

    @Test
    public void testForms() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

    @Test
    public void testExpectForm() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        FormElement form = document.expectForm("testCssQuery");
        assertNotNull(form);
        assertEquals("testCssQuery", form.getCssQuery());
    }

    @Test
    public void testTitle() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        String title = document.title();
        assertEquals("Example Title", title);
    }

    @Test
    public void testTitleUpdate() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        boolean update = document.updateMetaCharsetElement(true);
        assertTrue(update);
    }

}