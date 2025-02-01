package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document doc = new Document("http://example.com");
        Assert.assertEquals("http://example.com", doc.location());
    }

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://example.com");
        Assert.assertEquals("http://example.com", doc.location());
        Assert.assertNotNull(doc.head());
        Assert.assertNotNull(doc.body());
    }

    @Test
    public void locationTest() {
        Document doc = new Document("http://example.com");
        Assert.assertEquals("http://example.com", doc.location());
    }

    @Test
    public void connectionTest() {
        Connection connection = Jsoup.newSession();
        Document doc = new Document("http://example.com");
        doc.connection(connection);
        Assert.assertEquals(connection, doc.connection());
    }

    @Test
    public void formsTest() {
        Document doc = new Document("http://example.com");
        List<FormElement> forms = doc.forms();
        Assert.assertNotNull(forms);
    }

    @Test
    public void expectFormTest() {
        Document doc = Mockito.mock(Document.class);
        Mockito.when(doc.select("form")).thenReturn(new Elements());
        doc.expectForm("form");
    }

    @Test
    public void headTest() {
        Document doc = new Document("http://example.com");
        Element head = doc.head();
        assertEquals("head", head.normalName());
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com");
        doc.charset(StandardCharsets.ISO_8859_1);

        Charset charset = doc.charset();
        assertEquals(StandardCharsets.ISO_8859_1, charset);
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document doc = new Document("http://example.com");
        doc.updateMetaCharsetElement(true);
        assertTrue(doc.updateMetaCharsetElement());
        doc.updateMetaCharsetElement(false);
        assertFalse(doc.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("http://example.com");
        doc.charset(StandardCharsets.ISO_8859_1);
        doc.updateMetaCharsetElement(true);

        Document clone = doc.clone();
        assertEquals(doc.charset(), clone.charset());
        assertEquals(doc.updateMetaCharsetElement(), clone.updateMetaCharsetElement());
        assertEquals(doc.location(), clone.location());
    }

    @Test
    public void parserTest() {
        Document doc = new Document("http://example.com");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);

        assertEquals(parser, doc.parser());
    }

    @Test
    public void titleTest() {
        Document doc = new Document("http://example.com");
        String title = "Sample Title";
        doc.title(title);

        assertEquals(title, doc.title());
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        Element element = doc.createElement("div");

        assertEquals("div", element.normalName());
    }

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("http://example.com");

        Element html = doc.appendElement("html");
        html.appendElement("head");
        html.appendElement("body");

        assertTrue(doc.outerHtml().contains("<html>"));
        assertTrue(doc.outerHtml().contains("<head>"));
        assertTrue(doc.outerHtml().contains("<body>"));
    }

}