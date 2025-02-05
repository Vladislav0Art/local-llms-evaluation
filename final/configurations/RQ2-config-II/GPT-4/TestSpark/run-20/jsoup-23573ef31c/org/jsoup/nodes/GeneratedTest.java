package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://test.com");
        assertNotNull(doc);
    }

    @Test
    public void locationTest() {
        Document doc = new Document("http://test.com");
        assertEquals("http://test.com", doc.location());
    }

    @Test
    public void connectionSetAndGetTest() {
        Document doc = new Document("http://test.com");
        Connection connection = mock(Connection.class);
        doc.connection(connection);
        assertEquals(connection, doc.connection());
    }

    @Test
    public void headTest() {
        Document doc = new Document("http://test.com");
        assertNotNull(doc.head());
    }

    @Test
    public void bodyTest() {
        Document doc = new Document("http://test.com");
        assertNotNull(doc.body());
    }

    @Test
    public void formsTest() {
        Document doc = new Document("http://test.com");
        List<FormElement> forms = doc.forms();
        assertNotNull(forms);
    }

    @Test
    public void expectFormTest() {
        Document doc = new Document("http://test.com");
        FormElement form = doc.expectForm("form");
        assertNotNull(form);
    }

    @Test
    public void titleSetAndGetTest() {
        Document doc = new Document("http://test.com");
        doc.title("Test");
        assertEquals("Test", doc.title());
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("http://test.com");
        Element el = doc.createElement("div");
        assertEquals("div", el.tagName());
    }

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("http://test.com");
        assertNotNull(doc.outerHtml());
    }

    @Test
    public void nodeNameTest() {
        Document doc = new Document("http://test.com");
        assertEquals("#document", doc.nodeName());
    }

    @Test
    public void charsetSetAndGetTest() {
        Document doc = new Document("http://test.com");
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

    @Test
    public void updateMetaCharsetElementSetAndGetTest() {
        Document doc = new Document("http://test.com");
        doc.updateMetaCharsetElement(true);
        assertTrue(doc.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("http://test.com");
        Document cloneDoc = doc.clone();
        assertNotSame(doc, cloneDoc);
        assertEquals(doc.location(), cloneDoc.location());
    }

    @Test
    public void outputSettingsSetAndGetTest() {
        Document doc = new Document("http://test.com");
        OutputSettings outputSettings = new OutputSettings();
        doc.outputSettings(outputSettings);
        assertEquals(outputSettings, doc.outputSettings());
    }

    @Test
    public void quirksModeSetAndGetTest() {
        Document doc = new Document("http://test.com");
        doc.quirksMode(QuirksMode.QUIRKY);
        assertEquals(QuirksMode.QUIRKS, doc.quirksMode());
    }

    @Test
    public void parserSetAndGetTest() {
        Document doc = new Document("http://test.com");
        Parser parser = new Parser(new TreeBuilder());
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

}