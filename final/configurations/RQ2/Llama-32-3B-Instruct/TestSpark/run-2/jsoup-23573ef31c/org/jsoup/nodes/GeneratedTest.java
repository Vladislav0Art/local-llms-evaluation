package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.jsoup.charset.Charset;
import org.jsoup.nodes.Connection;
import org.jsoup.nodes.OutputSettings;

public class GeneratedTest {

    public static Connection getConnection() {
        return new Connection();
    }

    @Test
    public void createShellDocument() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
    }

    @Test
    public void locationWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        assertEquals("/document", document.location());
    }

    @Test
    public void documentTypeWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        assertEquals(null, document.documentType());
    }

    @Test
    public void headWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document.head());
    }

    @Test
    public void bodyWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document.body());
    }

    @Test
    public void formsWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document.forms());
    }

    @Test
    public void expectFormWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        FormElement form = document.expectForm("body > form");
        assertNotNull(form);
    }

    @Test
    public void titleWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        assertEquals("", document.title());
    }

    @Test
    public void createElementWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

    @Test
    public void outerHtmlWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        assertEquals("", document.outerHtml());
    }

    @Test
    public void textWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        document.text("Hello World!");
        assertEquals("Hello World!", document.text());
    }

    @Test
    public void nodeNameWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        assertEquals("document", document.nodeName());
    }

    @Test
    public void updateMetaCharsetElementWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        boolean result = document.updateMetaCharsetElement();
        assertTrue(result);
    }

    @Test
    public void cloneWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        Document clonedDocument = document.clone();
        assertNotNull(clonedDocument);
    }

    @Test
    public void shallowCloneWorksCorrectly() {
        Document document = Document.createShell("http://example.com");
        Document shallowClonedDocument = document.shallowClone();
        assertNotNull(shallowClonedDocument);
    }

}