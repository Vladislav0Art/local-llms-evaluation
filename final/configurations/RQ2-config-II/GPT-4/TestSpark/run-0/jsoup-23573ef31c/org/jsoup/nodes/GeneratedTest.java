package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void createShellValidUriTest() {
        Document document = Document.createShell("http://test.com");
        assertNotNull(document);
    }

    @Test
    public void createShellInvalidUriTest() {
        Document.createShell(null);
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://test.com");
        assertEquals("http://test.com", document.location());
    }

    @Test
    public void connectionTest() {
        Connection connection = Mockito.mock(Connection.class);
        Document document = new Document("http://test.com");
        document.connection(connection);
        assertSame(connection, document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("http://test.com");
        assertNull(document.documentType());
    }

    @Test
    public void createElementValidTagTest() {
        Document document = new Document("http://test.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

    @Test
    public void createElementInvalidTagTest() {
        Document document = new Document("http://test.com");
        document.createElement(null);
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://test.com");
        document.charset(Charset.defaultCharset());
        assertSame(Charset.defaultCharset(), document.charset());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://test.com");
        OutputSettings outputSettings = new OutputSettings();
        document.outputSettings(outputSettings);
        assertSame(outputSettings, document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://test.com");
        document.quirksMode(QuirksMode.quirks);
        assertSame(QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://test.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        assertSame(parser, document.parser());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://test.com");
        assertNotSame(document, document.clone());
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://test.com");
        assertNotSame(document, document.shallowClone());
    }

}