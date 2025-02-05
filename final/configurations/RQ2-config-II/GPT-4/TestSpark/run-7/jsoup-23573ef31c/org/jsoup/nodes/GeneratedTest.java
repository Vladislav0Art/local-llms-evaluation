package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.FormElement;

import java.nio.charset.Charset;
import java.util.List;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://example.com");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("http://example.com");
        DocumentType documentType = document.documentType();
        assertNotNull(documentType);
    }

    @Test
    public void bodyTest() {
        Document document = new Document("http://example.com");
        Element body = document.body();
        assertNotNull(body);
    }

    @Test
    public void formsTest() {
        Document document = new Document("http://example.com");
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
    }

    @Test
    public void expectFormTest() {
        Document document = new Document("http://example.com");
        FormElement form = document.expectForm(".form");
        assertNotNull(form);
    }

    @Test
    public void titleTest() {
        Document document = new Document("http://example.com");
        document.title("Test Title");
        assertEquals("Test Title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("http://example.com");
        String html = document.outerHtml();
        assertNotNull(html);
    }

    @Test
    public void textTest() {
        Document document = new Document("http://example.com");
        document.text("Test Text");
        assertEquals("Test Text", document.text());
    }

    @Test
    public void nodeNameTest() {
        Document document = new Document("http://example.com");
        String nodeName = document.nodeName();
        assertEquals("#document", nodeName);
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://example.com");
        document.updateMetaCharsetElement(true);
        assertEquals(true, document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://example.com");
        Document clonedDocument = document.clone();
        assertNotSame(document, clonedDocument);
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://example.com");
        Document shallowClonedDocument = document.shallowClone();
        assertNotSame(document, shallowClonedDocument);
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://example.com");
        OutputSettings outputSettings = new OutputSettings();
        document.outputSettings(outputSettings);
        assertEquals(outputSettings, document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://example.com");
        Document.QuirksMode quirksMode = Document.QuirksMode.quirks;
        document.quirksMode(quirksMode);
        assertEquals(quirksMode, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://example.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

    @Test
    public void connectionSetTest() {
        Document document = new Document("http://example.com");
        Connection connection = Jsoup.connect("http://example.com");
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

}