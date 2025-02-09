package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        String baseUri = "http://example.com";
        Document doc = Document.createShell(baseUri);
        assertNotNull(doc);
        assertEquals(baseUri, doc.location());
    }

    @Test
    public void connectionTest() {
        Document doc = new Document("http://example.com");
        Connection conn = new Connection();
        doc.connection(conn);
        assertEquals(conn, doc.connection());
    }

    @Test
    public void documentTypeTest() {
        Document doc = new Document("http://example.com");
        DocumentType docType = doc.documentType();
        assertNull(docType);
    }

    @Test
    public void titleTest() {
        Document doc = new Document("http://example.com");
        String title = "Test Title";
        doc.title(title);
        assertEquals(title, doc.title());
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        String tagName = "p";
        Element element = doc.createElement(tagName);
        assertNotNull(element);
        assertEquals(tagName, element.tagName());
    }

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("http://example.com");
        String outerHtml = "<html><head></head><body></body></html>";
        assertEquals(outerHtml, doc.outerHtml());
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document doc = new Document("http://example.com");
        assertFalse(doc.updateMetaCharsetElement());

        doc.updateMetaCharsetElement(true);
        assertTrue(doc.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("http://example.com");
        Document clonedDoc = doc.clone();
        assertNotSame(clonedDoc, doc);
    }

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("http://example.com");
        Document.OutputSettings settings = new Document.OutputSettings();
        doc.outputSettings(settings);
        assertEquals(settings, doc.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document doc = new Document("http://example.com");
        Document.QuirksMode mode = Document.QuirksMode.quirks;
        doc.quirksMode(mode);
        assertEquals(mode, doc.quirksMode());
    }

    @Test
    public void parserTest() {
        Document doc = new Document("http://example.com");
        Parser parser = new Parser();
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

}