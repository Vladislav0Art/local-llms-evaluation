package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://google.com");
        assertNotNull(doc);
        assertEquals("http://google.com", doc.location());
        assertTrue(doc.parser() instanceof Parser);
    }

    @Test
    public void locationTest() {
        Document doc = new Document("http://google.com");
        assertEquals("http://google.com", doc.location());
    }

    @Test
    public void connectionTest() {
        Document doc = new Document("http://google.com");
        assertTrue(doc.connection() instanceof Connection);
    }

    @Test
    public void documentTypeTest() {
        Document doc = mock(Document.class);
        doCallRealMethod().when(doc).documentType();
        assertNull(doc.documentType());
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("http://google.com");
        assertTrue(doc.createElement("div") instanceof Element);
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("http://google.com");
        Charset charset = Charset.defaultCharset();
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("http://google.com");
        Document cloneDoc = doc.clone();
        assertEquals(doc.parser().getClass(), cloneDoc.parser().getClass());
        assertEquals(doc.charset(), cloneDoc.charset());
    }

    @Test
    public void bodyTest() {
        Document doc = new Document("http://google.com");
        Element body = doc.body();
        assertNotNull(body);
        assertEquals("body", body.nodeName());
    }

    @Test
    public void formsTest() {
        Document doc = mock(Document.class);
        when(doc.forms()).thenCallRealMethod();
        Elements elements = mock(Elements.class);
        when(doc.select("form")).thenReturn(elements);
        assertTrue(doc.forms() instanceof List);
        verify(doc).select("form");
    }

    @Test
    public void expectFormTest() {
        Document doc = mock(Document.class);
        when(doc.expectForm("form")).thenCallRealMethod();
        Elements elements = mock(Elements.class);
        when(doc.select("form")).thenReturn(elements);
        doc.expectForm("form");
        verify(doc).select("form");
    }

    @Test
    public void titleTest() {
        Document doc = new Document("http://google.com");
        doc.head().appendElement("title").text("Google");
        assertEquals("Google", doc.title());
    }

    @Test
    public void parserTest() {
        Document doc = new Document("http://google.com");
        Parser parser = Parser.xmlParser();
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

}