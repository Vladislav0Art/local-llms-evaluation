package org.jsoup.nodes;

public class GeneratedTest {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void testCreateShell_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        Assert.assertNotNull(document);
    }

    @Test
    public void testLocation_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void testConnection_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        Connection connection = document.connection();
        Assert.assertNotNull(connection);
    }

    @Test
    public void testDocumentType_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        assertEquals(Document.DocumentType.CURRENT, document.documentType());
    }

    @Test
    public void testHead_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        Element head = document.head();
        Assert.assertNotNull(head);
    }

    @Test
    public void testBody_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        Element body = document.body();
        Assert.assertNotNull(body);
    }

    @Test
    public void testForms_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        List<FormElement> forms = document.forms();
        Assert.assertNotNull(forms);
    }

    @Test
    public void testExpectForm_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        FormElement form = document.expectForm("test");
        Assert.assertNotNull(form);
    }

    @Test
    public void testTitle_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        String title = "Test Title";
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void testTitle_WithMultipleSpaces_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        String title = " Test   Title";
        document.title(title);
        assertEquals("  Test   Title", document.title());
    }

    @Test
    public void testElementCreate_Simple() throws Exception {
        Document document = org.jsoup.nodes.Document.createShell(BASE_URI);
        Element element = document.createElement("div");
        Assert.assertNotNull(element);
    }

}