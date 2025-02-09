package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedTest {

    @Test
    public void constructorBaseUriTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void createShellTest() {
        Document shell = Document.createShell("http://exampleShell.com");
        assertEquals("http://exampleShell.com", shell.location());
    }

    @Test
    public void titleGetterSetterTest() {
        Document document = new Document("http://example.com");
        document.title("Test Title");
        assertEquals("Test Title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("div");
        assertEquals("div", element.nodeName());
    }

    @Test
    public void textTest() {
        Document document = new Document("http://example.com");
        document.text("Test Text");
        assertEquals("Test Text", document.text());
    }

    @Test
    public void charsetGetterSetterTest() {
        Document document = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElementGetterSetterTest() {
        Document document = new Document("http://example.com");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://example.com");
        Document clone = document.clone();
        assertEquals(clone.outerHtml(), document.outerHtml());
    }

    @Test
    public void parserGetterSetterTest() {
        Document document = new Document("http://example.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://example.com");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

    @Test
    public void formsTest() {
        Document document = new Document("http://example.com");
        List<FormElement> formElements = document.forms();
        assertNotNull(formElements);
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://example.com");
        Document.OutputSettings outputSettings = document.outputSettings().prettyPrint(false);
        document.outputSettings(outputSettings);
        assertFalse(document.outputSettings().prettyPrint());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://example.com");
        document.quirksMode(Document.QuirksMode.quirky);
        assertEquals(Document.QuirksMode.quirky, document.quirksMode());
    }

}