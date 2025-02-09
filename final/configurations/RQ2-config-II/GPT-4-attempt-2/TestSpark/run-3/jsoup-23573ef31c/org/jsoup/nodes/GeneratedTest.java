package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Document doc = new Document("http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void locationTest() {
        Document doc = new Document("http://example.com");
        assertEquals("http://example.com", doc.location());
    }

    @Test
    public void connectionTest() {
        Document doc = new Document("http://example.com");
        Connection con = doc.connection();
        assertNotNull(con);
    }

    @Test
    public void documentTypeTest() {
        Document doc = new Document("http://example.com");
        assertNull(doc.documentType());
    }

    @Test
    public void formsTest() {
        Document doc = new Document("http://example.com");
        List<FormElement> forms = doc.forms();
        assertNotNull(forms);
    }

    @Test
    public void titleTest() {
        Document doc = new Document("http://example.com");
        doc.title("Test Title");
        assertEquals("Test Title", doc.title());
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        Element element = doc.createElement("p");
        assertNotNull(element);
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com");
        doc.charset(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, doc.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document doc = new Document("http://example.com");
        doc.updateMetaCharsetElement(true);
        assertTrue(doc.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("http://example.com");
        Document cloneDoc = doc.clone();
        assertNotNull(cloneDoc);
    }

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("http://example.com");
        OutputSettings outputSettings = new OutputSettings();
        doc.outputSettings(outputSettings);
        assertEquals(outputSettings, doc.outputSettings());
    }

    @Test
    public void parserTest() {
        Document doc = new Document("http://example.com");
        Parser parser = new Parser(doc);
        Document docWithParser = doc.parser(parser);
        assertEquals(docWithParser.parser(), parser);
    }

}