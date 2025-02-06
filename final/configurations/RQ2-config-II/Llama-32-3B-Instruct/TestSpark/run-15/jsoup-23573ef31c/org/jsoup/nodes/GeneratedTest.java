package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.Document;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createShellDocument() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
    }

    @Test
    public void locationReturnsBaseUri() {
        Document document = Document.createShell("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void titleSetsTitle() {
        Document document = Document.createShell("http://example.com");
        assertEquals("", document.title());
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

    @Test
    public void outerHtmlReturnsCorrectString() {
        String html = "<html><body>Hello World!</body></html>";
        Connection connection = Jsoup.connect(html);
        Document document = connection.get();
        assertEquals("<html><body>Hello World!</body></html>", document.outerHtml());
    }

    @Test
    public void createElementCreatesNewElement() {
        Element parent = new org.jsoup.nodes.Element();
        Document document = Document.createShell("http://example.com");
        Element child = document.createElement("div");
        assertEquals(child, document.createElement("div"));
    }

    @Test
    public void charsetUpdatesCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Document.createShell("http://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void outputSettingsSetsOutputSettings() {
        OutputSettings settings = new org.jsoup.helper.OutputSettings();
        Document document = Document.createShell("http://example.com");
        document.outputSettings(settings);
        assertEquals(settings, document.outputSettings());
    }

    @Test
    public void parserUpdatesParser() {
        Parser parser = Mockito.mock(Parser.class);
        Document document = Document.createShell("http://example.com");
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}