package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.Jsoup;

public class GeneratedTest {

    @Test
    public void newDocument_CreatesNewInstance() {
        Document document = new Document("https://www.example.com");
        assertNotNull(document);
    }

    @Test
    public void createShell_CreatesNewInstance() {
        Document document = Document.createShell("https://www.example.com");
        assertNotNull(document);
    }

    @Test
    public void location_GetLocationReturnsString() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = new Document(connection.url());
        String location = document.location();
        assertNotNull(location);
    }

    @Test
    public void head_RetrievesHeadElement() {
        Document document = new Document("https://www.example.com");
        Element head = document.head();
        assertNotNull(head);
    }

    @Test
    public void body_RetrievesBodyElement() {
        Document document = new Document("https://www.example.com");
        Element body = document.body();
        assertNotNull(body);
    }

    @Test
    public void forms_RetrievesFormsElements() {
        Document document = new Document("https://www.example.com");
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
    }

    @Test
    public void expectForm_ReturnsCorrectFormElement() {
        Connection connection = Jsoup.connect("https://www.example.com/form");
        Document document = new Document(connection.url());
        FormElement form = document.expectForm("form");
        assertEquals(document, form);
    }

    @Test
    public void title_SetTitleReturnsString() {
        Document document = new Document("https://www.example.com");
        String title = document.title();
        assertNotNull(title);
    }

    @Test
    public void createElement_CreatesNewElement() {
        Document document = new Document("https://www.example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

    @Test
    public void outerHtml_ReturnsOuterHTMLString() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = new Document(connection.url());
        String outerHtml = document.outerHtml();
        assertNotNull(outerHtml);
    }

    @Test
    public void text_SetTextReturnsString() {
        Document document = new Document("https://www.example.com");
        String text = document.text("Hello World");
        assertEquals("Hello World", text);
    }

    @Test
    public void nodeName_ReturnsNodeName() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = new Document(connection.url());
        String node_name = document.nodeName();
        assertNotNull(node_name);
    }

    @Test
    public void charset_SetCharsetReturnsString() {
        Document document = new Document("https://www.example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElement

    ReturnsBooleanValue() {
        Document document = new Document("https://www.example.com");
        boolean result = document.updateMetaCharsetElement();
        assertTrue(result);
    }

    @Test
    public void clone_ReturnsNewDocumentInstance() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = new Document(connection.url());
        Document cloned = document.clone();
        assertNotNull(cloned);
    }

    @Test
    public void shallowClone_ReturnsShallowClonedDocument() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = new Document(connection.url());
        Document cloned = document.shallowClone();
        assertNotNull(cloned);
    }

    @Test
    public void outputSettings_ReturnsOutputSettingsInstance() {
        Document document = new Document("https://www.example.com");
        OutputSettings settings = document.outputSettings();
        assertNotNull(settings);
    }

    @Test
    public void parser_ReturnsParserInstance() {
        Document document = new Document("https://www.example.com");
        Parser parser = document.parser();
        assertNotNull(parser);
    }

}