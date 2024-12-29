package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void baseUriConstructorTest() {
        Document document = new Document("https://www.example.com");
        assertNotNull(document);
    }

    @Test
    public void createShellTest() {
        Document shell = Document.createShell("https://www.example.com");
        assertEquals(shell.baseUri(), "https://www.example.com");
    }

    @Test
    public void locationTest() {
        Document document = new Document("https://www.example.com");
        assertEquals("https://www.example.com", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("https://www.example.com");
        Connection connection = mock(Connection.class);
        document.connection(connection);
        assertEquals(connection, document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("https://www.example.com");
        DocumentType documentType = mock(DocumentType.class);
        document.appendChild(documentType);
        assertEquals(documentType, document.documentType());
    }

    @Test
    public void headElementTest() {
        Document document = new Document("https://www.example.com");
        assertNotNull(document.head());
    }

    @Test
    public void bodyElementTest() {
        Document document = new Document("https://www.example.com");
        assertNotNull(document.body());
    }

    @Test
    public void formsElementTest() {
        Document document = new Document("https://www.example.com");
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
    }

    @Test
    public void expectFormTest() {
        Document document = new Document("https://www.example.com");
        FormElement formElement = document.expectForm("form");
        assertNotNull(formElement);
    }

    @Test
    public void titleTest() {
        Document document = new Document("https://www.example.com");
        document.title("Test Title");
        assertEquals("Test Title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("https://www.example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("https://www.example.com");
        String outerHtml = document.outerHtml();
        assertNotNull(outerHtml);
    }

    @Test
    public void textTest() {
        Document document = new Document("https://www.example.com");
        String text = "Test Text";
        document.text(text);
        assertEquals(text, document.text());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("https://www.example.com");
        Document clone = document.clone();
        assertNotNull(clone);
        assertEquals(document.outerHtml(), clone.outerHtml());
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("https://www.example.com");
        Document shallowClone = document.shallowClone();
        assertNotNull(shallowClone);
        assertEquals(document.outerHtml(), shallowClone.outerHtml());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("https://www.example.com");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
        document.updateMetaCharsetElement(false);
        assertFalse(document.updateMetaCharsetElement());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("https://www.example.com");
        Document.OutputSettings settings = new Document.OutputSettings();
        document.outputSettings(settings);
        assertEquals(settings, document.outputSettings());
    }

    @Test
    public void parserTest() {
        Document document = new Document("https://www.example.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}