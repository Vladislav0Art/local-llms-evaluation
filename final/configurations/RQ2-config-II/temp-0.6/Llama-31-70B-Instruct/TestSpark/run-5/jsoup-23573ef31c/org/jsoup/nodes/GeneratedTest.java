package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void locationTest() {
        Document doc = new Document("http://example.com");
        assertEquals("http://example.com", doc.location());
    }

    @Test
    public void connectionTest() {
        Document doc = new Document("http://example.com");
        assertEquals(Connection.GET, doc.connection().method());
    }

    @Test
    public void documentTypeTest() {
        Document doc = new Document("http://example.com");
        assertEquals(DocumentType.html5, doc.documentType());
    }

    @Test
    public void headTest() {
        Document doc = new Document("http://example.com");
        Element head = doc.head();
        assertEquals("head", head.nodeName());
    }

    @Test
    public void bodyTest() {
        Document doc = new Document("http://example.com");
        Element body = doc.body();
        assertEquals("body", body.nodeName());
    }

    @Test
    public void formsTest() {
        Document doc = new Document("http://example.com");
        assertEquals(0, doc.forms().size());
    }

    @Test
    public void expectFormTest() {
        Document doc = new Document("http://example.com");
        assertEquals(0, doc.expectForm("form").size());
    }

    @Test
    public void titleTest() {
        Document doc = new Document("http://example.com");
        assertEquals("", doc.title());
    }

}