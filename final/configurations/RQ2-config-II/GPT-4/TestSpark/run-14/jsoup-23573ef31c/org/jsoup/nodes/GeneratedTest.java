package org.jsoup.nodes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.nodes.Document.QuirksMode;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;

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
    public void connectionTest() {
        Document document = new Document("http://example.com");
        assertNull(document.connection());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://example.com");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        assertSame(charset, document.charset());
    }

    @Test
    public void outputSettingsDefaultTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document.outputSettings());
    }

    @Test
    public void outputSettingsSetterTest() {
        Document document = new Document("http://example.com");
        OutputSettings settings = new OutputSettings();
        document.outputSettings(settings);
        assertSame(settings, document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://example.com");
        document.quirksMode(QuirksMode.quirks);
        assertSame(QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://example.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        assertSame(parser, document.parser());
    }

    @Test
    public void connectionSetterTest() {
        Document document = new Document("http://example.com");
        Connection connection = mock(Connection.class);
        document.connection(connection);
        assertSame(connection, document.connection());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://example.com");
        Document clone = document.clone();
        assertNotSame(document, clone);
        assertEquals(document.location(), clone.location());
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://example.com");
        Document clone = document.shallowClone();
        assertNotSame(document, clone);
        assertEquals(document.location(), clone.location());
    }

    @Test
    public void titleSetterTest() {
        Document document = new Document("http://example.com");
        String title = "Test Title";
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://example.com");
        Element newElement = document.createElement("div");
        assertEquals("div", newElement.nodeName());
    }

    @Test
    public void nodeNameTest() {
        Document document = new Document("http://example.com");
        assertEquals("#document", document.nodeName());
    }

}