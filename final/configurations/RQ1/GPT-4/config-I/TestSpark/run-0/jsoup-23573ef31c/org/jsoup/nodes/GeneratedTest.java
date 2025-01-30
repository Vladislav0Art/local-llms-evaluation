package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.nio.charset.Charset;

public class GeneratedTest {

    @Test
    public void locationTest() {
        Document doc = new Document("test");
        assertSame("test", doc.location());
    }

    @Test
    public void connectionTest() {
        Connection connection = mock(Connection.class);
        Document doc = new Document("");
        doc.connection(connection);
        assertSame(connection, doc.connection());
    }

    @Test
    public void titleTest() {
        Document doc = new Document("");
        doc.title("Test");
        assertSame("Test", doc.title());
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("");
        Element element = doc.createElement("Test");

        assertEquals("Test", element.tagName());
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("");
        doc.charset(Charset.forName("ISO-8859-1"));

        assertEquals(Charset.forName("ISO-8859-1"), doc.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document doc = new Document("");
        doc.updateMetaCharsetElement(true);

        assertTrue(doc.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("");
        Document clonedDoc = doc.clone();

        assertNotSame(doc, clonedDoc);
    }

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        doc.outputSettings(outputSettings);

        assertSame(outputSettings, doc.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document doc = new Document("");
        doc.quirksMode(Document.QuirksMode.quirks);

        assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void parserTest() {
        Document doc = new Document("");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);

        assertSame(parser, doc.parser());
    }

}