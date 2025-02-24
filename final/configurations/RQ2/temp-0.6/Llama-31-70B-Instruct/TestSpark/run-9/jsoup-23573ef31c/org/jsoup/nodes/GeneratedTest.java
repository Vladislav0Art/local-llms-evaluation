package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void locationTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://example.com");
        assertNull(document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("http://example.com");
        assertNull(document.documentType());
    }

    @Test
    public void headTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document.head());
    }

    @Test
    public void bodyTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document.body());
    }

    @Test
    public void formsTest() {
        Document document = new Document("http://example.com");
        assertEquals(0, document.forms().size());
    }

    @Test
    public void expectFormTest() {
        Document document = new Document("http://example.com");
        assertNull(document.expectForm("form"));
    }

    @Test
    public void titleTest() {
        Document document = new Document("http://example.com");
        assertEquals("", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document.createElement("div"));
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document.outerHtml());
    }

    @Test
    public void textTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document.text("text"));
    }

}