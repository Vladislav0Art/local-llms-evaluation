package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("https://sample.com");
        assertEquals("https://sample.com", document.baseUri());
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell("https://sample.com");
        assertEquals("https://sample.com", document.baseUri());
    }

    @Test
    public void locationTest() {
        Document document = new Document("https://sample.com");
        assertEquals("https://sample.com", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("https://sample.com");
        assertNull(document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("https://sample.com");
        assertNull(document.documentType());
    }

    @Test
    public void headTest() {
        Document document = Document.createShell("https://sample.com");
        assertNotNull(document.head());
    }

    @Test
    public void bodyTest() {
        Document document = Document.createShell("https://sample.com");
        assertNotNull(document.body());
    }

    @Test
    public void formsTest() {
        Document document = new Document("https://sample.com");
        assertTrue(document.forms().isEmpty());
    }

    @Test
    public void expectFormTest() {
        Document document = new Document("https://sample.com");
        document.expectForm("");
    }

    @Test
    public void titleTest() {
        Document document = Document.createShell("https://sample.com");
        assertEquals("", document.title());
    }

    @Test
    public void titleSetterTest() {
        Document document = Document.createShell("https://sample.com");
        document.title("Sample Title");
        assertEquals("Sample Title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("https://sample.com");
        assertNotNull(document.createElement("div"));
    }

    @Test
    public void outerHtmlTest() {
        Document document = Document.createShell("https://sample.com");
        assertNotNull(document.outerHtml());
    }

    @Test
    public void textTest() {
        Document document = Document.createShell("https://sample.com");
        assertEquals("", document.text());
    }

    @Test
    public void nodeNameTest() {
        Document document = new Document("https://sample.com");
        assertEquals("#document", document.nodeName());
    }

    @Test
    public void charsetTest() {
        Document document = Document.createShell("https://sample.com");
        assertNotNull(document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("https://sample.com");
        assertFalse(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("https://sample.com");
        Document clonedDocument = document.clone();
        assertEquals(document.outerHtml(), clonedDocument.outerHtml());
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("https://sample.com");
        Document clonedDocument = document.shallowClone();
        assertEquals(document.outerHtml(), clonedDocument.outerHtml());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("https://sample.com");
        assertNotNull(document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("https://sample.com");
        assertNotNull(document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = new Document("https://sample.com");
        assertNotNull(document.parser());
    }

}