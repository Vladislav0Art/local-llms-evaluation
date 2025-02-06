package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void createShellDocumentTest() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
    }

    @Test
    public void locationDocumentTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void connectionDocumentTest() {
        Document document = new Document("http://example.com");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

    @Test
    public void titleElementCreationTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("title");
        assertNotNull(element);
    }

    @Test
    public void createFormElementTest() {
        Document document = new Document("http://example.com");
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

    @Test
    public void expectFormElementCreationTest() {
        Document document = new Document("http://example.com");
        FormElement form = document.expectForm("form");
        assertNotNull(form);
    }

    @Test
    public void createElementMethodTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("p");
        assertNotNull(element);
    }

    @Test
    public void createShellDocumentCreationTest() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
    }

    @Test
    public void outerHtmlElementMethodTest() {
        Document document = new Document("http://example.com");
        String html = document.outerHtml();
        assertTrue(html.isEmpty());
    }

    @Test
    public void textElementMethodTest() {
        Document document = new Document("http://example.com");
        Element element = document.text("Hello World!");
        assertNotNull(element);
    }

    @Test
    public void nodeNameDocumentMethodTest() {
        Document document = new Document("http://example.com");
        String name = document.nodeName();
        assertEquals("", name);
    }

    @Test
    public void charsetSettingTest() {
        Document document = new Document("http://example.com");
        document.charset("UTF-8");
        assertEquals("UTF-8", document.charset());
    }

    @Test
    public void updateMetaCharsetElementMethodTest() {
        Document document = new Document("http://example.com");
        boolean updated = document.updateMetaCharsetElement();
        assertTrue(updated);
    }

    @Test
    public void createShellDocumentOutputSettingsTest() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = Document.createShell(outputSettings);
        assertNotNull(document);
    }

    @Test
    public void connectionSettingMethodTest() {
        Document document = new Document("http://example.com");
        Connection connection = document.connection(new Connection());
        assertEquals(new Connection(), connection);
    }

}