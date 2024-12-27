package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Connection;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.OutputSettings;
import org.jsoup.nodes.Parser;
import org.jsoup.nodes.QuirksMode;
import org.jsoup.options.Charset;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createShell_document() {
        Document document = new Document("http://example.com");
        assertNotNull(document);
    }

    @Test
    public void location_string() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void title_setString() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("title");
        element.text("My Title");
        document.appendChild(element);
        assertEquals("My Title", document.title());
    }

    @Test
    public void createElement_setString() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

    @Test
    public void outerHtml_string() {
        Document document = new Document("http://example.com");
        document.appendChild(document.createElement("html"));
        document.appendChild(document.createElement("body"));
        document.body.appendChild(document.createElement("text"));
        assertEquals("<html><body><text></text></body></html>", document.outerHtml());
    }

    @Test
    public void nodeName_getString() {
        Document document = new Document("http://example.com");
        assertEquals("", document.nodeName());
    }

    @Test
    public void charset_setCharset() {
        Document document = new Document("http://example.com");
        Charset charset = "UTF-8";
        document.charset(charset);
        assertTrue(document.charset() == charset);
    }

}