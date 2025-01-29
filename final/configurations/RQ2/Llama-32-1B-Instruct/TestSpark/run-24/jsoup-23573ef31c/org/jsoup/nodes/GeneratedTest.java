package org.jsoup.nodes;

public class GeneratedTest {

    private static final String BASE_URI = "http://example.com";

    @Test
    public void documentLocation() throws Exception {
        Document doc = createDocument(BASE_URI);
        assertEquals("http://example.com/", doc.location());
    }

    @Test
    public void connection() throws Exception {
        Document doc = createDocument(BASE_URI);
        Connection conn = doc.connection();
        assertNotNull(conn);
    }

    @Test
    public void documentType() throws Exception {
        Document doc = createDocument(BASE_URI);
        DocumentType type = doc.documentType();
        assertEquals("http://example.com/ XHTML 1.0 Strict", type.href());
    }

    @Test
    public void headElement() throws Exception {
        Document doc = createDocument(BASE_URI);
        Element head = doc.head();
        assertNotNull(head);
        assertEquals("<head>", head.outerHtml());
    }

    @Test
    public void bodyElement() throws Exception {
        Document doc = createDocument(BASE_URI);
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("<body>", body.outerHtml());
    }

    @Test
    public void expectForm() throws Exception {
        Document doc = createDocument(BASE_URI);
        FormElement form = doc.expectForm("form");
        assertNotNull(form);
    }

    @Test
    public void title() throws Exception {
        Document doc = createDocument(BASE_URI);
        String title = "Example Title";
        doc.title(title);
        assertEquals(title, doc.title());
    }

    @Test
    public void createElement() throws Exception {
        Document doc = createDocument(BASE_URI);
        Element elem = doc.createElement("input");
        assertNotNull(elem);
    }

    @Test
    public void text() throws Exception {
        Document doc = createDocument(BASE_URI);
        String text = "Hello World!";
        doc.text(text);
        assertEquals(text, doc.text());
    }

    @Test
    public void nodeName() throws Exception {
        Document doc = createDocument(BASE_URI);
        String nodeName = doc.nodeName();
        assertNotNull(nodeName);
    }

    @Test
    public void updateMetaCharsetElement() throws Exception {
        Document doc = createDocument(BASE_URI);
        boolean update = true;
        doc.updateMetaCharsetElement(update);
        assertTrue(doc.updateMetaCharsetElement());
        doc.updateMetaCharsetElement(false);
    }

    @Test
    public void outputSettings() throws Exception {
        Document doc = createDocument(BASE_URI);
        OutputSettings outputSettings = doc.outputSettings();
        assertNotNull(outputSettings);
    }

    @Test
    public void documentShallowClone() throws Exception {
        Document doc1 = createDocument(BASE_URI);
        Document doc2 = doc1.shallowClone();
        assertEquals(doc1, doc2);
    }

}