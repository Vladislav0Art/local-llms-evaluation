package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://baseUri.com");
        assertNotNull(document);
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://baseUri.com");
        assertEquals("http://baseUri.com", document.location());
    }

    @Test
    public void connectionTest() {
        Connection mockedConnection = mock(Connection.class);
        Document document = new Document("http://baseUri.com");
        document.connection(mockedConnection);
        assertEquals(mockedConnection, document.connection());
    }

    @Test
    public void headTest() {
        Document document = new Document("http://baseUri.com");
        assertNotNull(document.head());
    }

    @Test
    public void bodyTest() {
        Document document = new Document("http://baseUri.com");
        assertNotNull(document.body());
    }

    @Test
    public void formsTest() {
        Document document = new Document("http://baseUri.com");
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
    }

    @Test
    public void expectFormExceptionTest() {
        Document document = new Document("http://baseUri.com");
        document.expectForm("nonexistent");
    }

    @Test
    public void titleTest() {
        Document document = new Document("http://baseUri.com");
        document.title("TestTitle");
        assertEquals("TestTitle", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://baseUri.com");
        assertNotNull(document.createElement("div"));
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("http://baseUri.com");
        assertNotNull(document.outerHtml());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://baseUri.com");
        document.charset(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://baseUri.com");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://baseUri.com");
        assertNotNull(document.clone());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://baseUri.com");
        assertNotNull(document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://baseUri.com");
        document.quirksMode(Document.QuirksMode.quirks);
        assertEquals(Document.QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Parser parser = new Parser(new Document("http://baseUri.com"));
        Document document = new Document("http://baseUri.com");
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}