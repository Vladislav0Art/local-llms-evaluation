package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void testDocumentConstructors() {
        Document document = new Document("https://example.com");
        assertEquals(0, document.baseUri(), "base uri");

        Document shell = Document.createShell("https://example.com/shell");
        assertEquals(0, shell.baseUri(), "base uri");

        Document doc = new Document(shell, "https://example.com/document");
        assertEquals(2, doc.baseUri().length(), "base uri length");
    }

    @Test
    public void testDocumentLocation() {
        Document document = new Document("https://example.com");
        assertEquals("", document.location());
        assertEquals("https://example.com", document.createShell("https://example.com").location());
    }

    @Test
    public void testDocumentConnection() {
        Document document = new Document("https://example.com");
        document.connection();
        assertNotNull(document.connection());
    }

    @Test
    public void testDocumentTitle() {
        Document document = new Document("https://example.com");
        assertEquals("", document.title());
        assertEquals("Example Document", document.title("Example Document"));
    }

    @Test
    public void testExpectFormElements() {
        Document document = new Document("https://example.com");
        FormElement form1 = document.expectForm(".my-class");
        assertNotNull(form1);
    }

    @Test
    public void testDocumentMethods() {
        Document document = new Document("https://example.com");
        assertEquals(4, document.head().length(), "head length");
        assertEquals(3, document.body().length(), "body length");
        assertEquals(10, document.forms().size(), "forms size");

        FormElement form1 = document.expectForm(".my-class");
        assertNotNull(form1);
    }

    @Test
    public void testDocumentOuterHtml() {
        Document document = new Document("https://example.com");
        String outerHtml = document.outerHtml();
        assertEquals("<html><head></head><body>Example Content</body></html>", outerHtml);
    }

    @Test
    public void testTextMethods() {
        Document document = new Document("https://example.com");
        assertEquals("", document.text(""));
        assertEquals("Example Content", document.text("Example Content"));
    }

    @Test
    public void testNodeNameMethods() {
        Document document = new Document("https://example.com");
        assertEquals("", document.nodeName());
        assertEquals("<html>", document.nodeName());
    }

    @Test
    public void testCharsetMethods() {
        Document document = new Document("https://example.com");
        assertNotNull(document.charset());
        assertEquals(ISO_8859 - 1, document.charset().code);
    }

    @Test
    public void testUpdateMetaCharsetElement() {
        Document document = new Document("https://example.com");
        document.updateMetaCharsetElement();
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void testCloneMethods() {
        Document document = new Document("https://example.com");
        Document clonedDoc = document.clone();
        assertEquals(0, clonedDoc.baseUri().length(), "base uri length");
    }

    @Test
    public void testShallowCloneMethods() {
        Document document = new Document("https://example.com");
        Document shallowClonedDoc = document.shallowClone();
        assertEquals(1, shallowClonedDoc.head().size(), "head size");
    }

}