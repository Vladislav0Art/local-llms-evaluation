package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document doc = new Document("https://example.com");
        assertEquals("https://example.com", doc.location());
    }

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("https://example.com");
        assertNotNull(doc);
        assertEquals("https://example.com", doc.location());
    }

    @Test
    public void connectionTest() {
        Connection connection = mock(Connection.class);
        Document doc = new Document("https://example.com");
        doc = doc.connection(connection);
        assertNotNull(doc.connection());
    }

    @Test
    public void headTest() {
        Document doc = new Document("https://example.com");
        Element head = doc.head();
        assertNotNull(head);
        assertEquals("head", head.nodeName());
    }

    @Test
    public void expectFormTest() {
        Document doc = new Document("https://example.com");
        FormElement form = doc.expectForm("div");
        assertNotNull(form);
    }

    @Test
    public void titleTest() {
        Document doc = new Document("https://example.com");
        doc.title("Test Title");
        assertEquals("Test Title", doc.title());
    }

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("https://example.com");
        String outerHtml = doc.outerHtml();
        assertNotNull(outerHtml);
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("https://example.com");
        doc.charset(java.nio.charset.StandardCharsets.UTF_8);
        assertEquals(java.nio.charset.StandardCharsets.UTF_8, doc.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document doc = new Document("https://example.com");
        doc.updateMetaCharsetElement(true);
        assertTrue(doc.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("https://example.com");
        Document clone = doc.clone();
        assertEquals(doc.outerHtml(), clone.outerHtml());
    }

    @Test
    public void quirksModeTest() {
        Document doc = new Document("https://example.com");
        doc.quirksMode(Document.QuirksMode.quirks);
        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void parserTest() {
        Parser parser = Parser.htmlParser();
        Document doc = new Document("https://example.com");
        doc = doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

}