package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://example.com");
        assertNotNull(doc);
        assertEquals("http://example.com", doc.location());
    }

    @Test
    public void locationTest() {
        Document doc = new Document("http://example.com");
        assertEquals("http://example.com", doc.location());
    }

    @Test
    public void connectionTest() {
        Document doc = new Document("http://example.com");
        Connection connection = doc.connection();
        assertNotNull(connection);
    }

    @Test
    public void titleTest() {
        Document doc = new Document("http://example.com");
        doc.title("Test Title");
        assertEquals("Test Title", doc.title());
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        Element e = doc.createElement("testElement");
        assertNotNull(e);
        assertEquals("testElement", e.nodeName());
    }

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("http://example.com");
        assertNotNull(doc.outerHtml());
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com");
        doc.charset(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, doc.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document doc = new Document("http://example.com");
        doc.updateMetaCharsetElement(true);
        assertTrue(doc.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("http://example.com");
        Document cloneDoc = doc.clone();
        assertNotNull(cloneDoc);
        assertNotSame(doc, cloneDoc);
    }

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("http://example.com");
        OutputSettings outputSettings = new OutputSettings();
        doc.outputSettings(outputSettings);
        assertEquals(outputSettings, doc.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document doc = new Document("http://example.com");
        doc.quirksMode(QuirksMode.QUIRKS);
        assertEquals(QuirksMode.QUIRKS, doc.quirksMode());
    }

    @Test
    public void parserTest() {
        Document doc = new Document("http://example.com");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

    @Test
    public void connectionInjectionTest() {
        Document doc = new Document("http://example.com");
        Connection connection = Connection.connect("http://example2.com");
        doc.connection(connection);
        assertEquals(connection, doc.connection());
    }

}