package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.Jsoup;

public class GeneratedTest {

    @Test
    public void createShell_ShellIsCreatedWithBaseUri() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertNotNull(document);
        assertEquals(baseUri, document.location());
    }

    @Test
    public void createShell_ShellIsNotNull() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertNotNull(document);
    }

    @Test
    public void location_LocationReturnsBaseUri() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertEquals(baseUri, document.location());
    }

    @Test
    public void location_LocationIsNotNull() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertNotNull(document.location());
    }

    @Test
    public void connection_ConnectionReturnsConnection() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertEquals(connection, document.connection());
    }

    @Test
    public void head_HeadElementIsCreated() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        Element head = document.head();
        assertNotNull(head);
        assertTrue(head instanceof Element);
    }

    @Test
    public void body_BodyElementIsCreated() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        Element body = document.body();
        assertNotNull(body);
        assertTrue(body instanceof Element);
    }

    @Test
    public void forms_FormsReturnsEmptyList() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
    }

    @Test
    public void expectForm_ExpectFormReturnsForm() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        FormElement form = document.expectForm("form");
        assertNotNull(form);
        assertTrue(form instanceof Element);
    }

    @Test
    public void title_TitleReturnsEmptyString() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertEquals("", document.title());
    }

    @Test
    public void title_TitleIsNotNull() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertNotNull(document.title());
    }

    @Test
    public void createElement_ElementIsCreatedWithTagName() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        Element element = document.createElement("div");
        assertNotNull(element);
        assertTrue(element instanceof Element);
    }

    @Test
    public void outerHtml_OuterHtmlReturnsEmptyString() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertEquals("", document.outerHtml());
    }

    @Test
    public void text_TextIsNotNull() {
        String baseUri = "https://example.com";
        Connection connection = Jsoup.connect(baseUri);
        Document document = Document.createShell(connection);
        assertNotNull(document.text());
    }

}