package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        String baseUri = "https://test.com";
        assertNotNull(Document.createShell(baseUri));
    }

    @Test
    public void locationTest() {
        String baseUri = "https://test.com";
        Document doc = new Document(baseUri);
        assertEquals(baseUri, doc.location());
    }

    @Test
    public void connectionTest() {
        Document doc = new Document("");
        Connection mockConnection = mock(Connection.class);
        Document dc = doc.connection(mockConnection);
        assertNotNull(dc);
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("");
        assertNull(document.documentType());
    }

    @Test
    public void headTest() {
        Document doc = Document.createShell("");
        assertNotNull(doc.head());
    }

    @Test
    public void bodyTest() {
        Document doc = Document.createShell("");
        assertNotNull(doc.body());
    }

    @Test
    public void expectFormTest() {
        Document doc = Document.createShell("");
        doc.expectForm(null);
    }

    @Test
    public void titleTest() {
        Document document = new Document("");
        document.title("Test title");
        assertEquals("Test title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("");
        assertNotNull(document.createElement("div"));
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("");
        assertTrue(document.outerHtml().contains("<html>"));
    }

    @Test
    public void textTest() {
        Document doc = new Document("");
        assertEquals(doc, doc.text("Test"));
    }

    @Test
    public void nodeNameTest() {
        Document doc = Document.createShell("");
        assertEquals("#document", doc.nodeName());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("");
        document.charset(java.nio.charset.Charset.forName("UTF-8"));
        assertNotNull(document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("");
        assertNotNull(doc.clone());
    }

    @Test
    public void shallowCloneTest() {
        Document doc = new Document("");
        assertNotNull(doc.shallowClone());
    }

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("");
        assertNotNull(doc.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document doc = new Document("");
        assertSame(doc, doc.quirksMode(QuirksMode.noQuirks));
        assertSame(QuirksMode.noQuirks, doc.quirksMode());
    }

    @Test
    public void parserTest() {
        Document doc = new Document("");
        Parser parser = Parser.htmlParser();
        assertSame(doc, doc.parser(parser));
        assertSame(parser, doc.parser());
    }

}