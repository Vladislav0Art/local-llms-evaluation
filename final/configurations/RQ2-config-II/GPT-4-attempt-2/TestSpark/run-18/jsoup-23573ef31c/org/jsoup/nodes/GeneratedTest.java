package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("http://example.com");
        document.createElement("p").text("test");
        assertTrue(document.outerHtml().contains("<p>test</p>"));
    }

    @Test
    public void titleTest() {
        Document document = new Document("http://example.com");
        document.title("test");
        assertEquals("test", document.title());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://example.com");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://example.com");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://example.com");
        Document clone = document.clone();
        assertEquals(document.outerHtml(), clone.outerHtml());
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://example.com");
        Document clone = document.shallowClone();
        assertEquals(document.outerHtml(), clone.outerHtml());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://example.com");
        OutputSettings settings = new OutputSettings();
        document.outputSettings(settings);
        assertEquals(settings, document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://example.com");
        document.quirksMode(Document.QuirksMode.quirks);
        assertEquals(Document.QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://example.com");
        Parser parser = Parser.xmlParser();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}