package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createShellWithValidBaseUri_ReturnsDocument() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

    @Test
    public void createShellWithInvalidBaseUri_ThrowsNullPointerException() {
        String baseUri = "";
        try {
            Document.createShell(baseUri);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // expected
        }
    }

    @Test
    public void location_ReturnsEmptyString() {
        Document document = new Document("");
        assertEquals("", document.location());
    }

    @Test
    public void connection_ReturnsNullConnection() {
        Document document = new Document("");
        assertNull(document.connection());
    }

    @Test
    public void documentType_ReturnsNullDocumentType() {
        Document document = new Document("");
        assertNull(document.documentType());
    }

    @Test
    public void head_ReturnsEmptyElement() {
        Document document = new Document("");
        Element element = document.head();
        assertTrue(element instanceof Element);
        assertEquals("HEAD", ((Element) element).nodeName());
    }

    @Test
    public void body_ReturnsEmptyElement() {
        Document document = new Document("");
        Element element = document.body();
        assertTrue(element instanceof Element);
        assertEquals("BODY", ((Element) element).nodeName());
    }

    @Test
    public void forms_ReturnsEmptyList() {
        Document document = new Document("");
        List<FormElement> list = document.forms();
        assertTrue(list.isEmpty());
    }

    @Test
    public void expectForm_ReturnsNullFormElement() {
        String cssQuery = "div";
        Document document = new Document("");
        FormElement formElement = document.expectForm(cssQuery);
        assertNull(formElement);
    }

    @Test
    public void title_SettingTitleSetsTitleAttribute() {
        Document document = new Document("");
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

    @Test
    public void outerHtml_ReturnsEmptyString() {
        Document document = new Document("");
        assertEquals("", document.outerHtml());
    }

    @Test
    public void nodeName_ReturnsEmptyString() {
        Document document = new Document("");
        assertEquals("", document.nodeName());
    }

    @Test
    public void clone_ReturnsShallowClone() {
        Document document = new Document("");
        Document shallowClone = document.clone();
        assertNotNull(shallowClone);
    }

    @Test
    public void shallowClone_ReturnsNullDocument() {
        Document document = new Document("");
        Document nullDocument = document.shallowClone();
        assertNull(nullDocument);
    }

    @Test
    public void shallowClone_ReturnsNullDocumentDirectly() {
        Document document = new Document("");
        Document nullDocument = document.shallowClone();
        assertNull(nullDocument);
    }

}