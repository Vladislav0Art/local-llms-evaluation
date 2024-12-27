package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTest {

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
    public void connectionTest() {
        Document document = new Document("http://example.com");
        assertNull(document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("http://example.com");
        assertNull(document.documentType());
    }

    @Test
    public void headTest() {
        Document document = new Document("http://example.com");
        Element head = document.head();
        assertNotNull(head);
        assertEquals("head", head.tagName());
    }

    @Test
    public void bodyTest() {
        Document document = new Document("http://example.com");
        Element body = document.body();
        assertNotNull(body);
        assertEquals("body", body.tagName());
    }

}