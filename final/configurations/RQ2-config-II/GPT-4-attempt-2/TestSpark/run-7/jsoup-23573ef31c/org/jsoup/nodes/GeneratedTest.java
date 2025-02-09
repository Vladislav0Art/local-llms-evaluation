package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    // Test constructor

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("http://localhost");
        assertNotNull(document);
    }

    @Test
    public void createShellTest() {
        Document shell = Document.createShell("http://localhost");
        assertNotNull(shell);
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://localhost");
        assertEquals("http://localhost", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://localhost");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("http://localhost");
        DocumentType documentType = document.documentType();
        assertNotNull(documentType);
    }

    @Test
    public void headTest() {
        Document document = new Document("http://localhost");
        Element head = document.head();
        assertNotNull(head);
    }

    @Test
    public void bodyTest() {
        Document document = new Document("http://localhost");
        Element body = document.body();
        assertNotNull(body);
    }

    @Test
    public void formsTest() {
        Document document = new Document("http://localhost");
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
    }

    @Test
    public void titleTest() {
        Document document = new Document("http://localhost");
        document.title("Test title");
        assertEquals("Test title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://localhost");
        Element element = document.createElement("p");
        assertEquals("p", element.tagName());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://localhost");
        document.charset(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://localhost");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://localhost");
        Document clonedDoc = document.clone();
        assertNotNull(clonedDoc);
        assertNotSame(document, clonedDoc);
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://localhost");
        Document shallowClonedDoc = document.shallowClone();
        assertNotNull(shallowClonedDoc);
        assertNotSame(document, shallowClonedDoc);
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://localhost");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

    @Test
    public void connectionGetterAndSetterTest() {
        Document document = new Document("http://localhost");
        Connection connection = Jsoup.connect("http://localhost");
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://localhost");
        document.quirksMode(QuirksMode.quirks);
        assertEquals(QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://localhost");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);
        assertEquals(outputSettings, document.outputSettings());
    }

}