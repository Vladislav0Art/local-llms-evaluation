package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void locationTest() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document.connection());
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
        assertNotNull(document.forms());
    }

    @Test
    public void expectFormTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document.expectForm("cssQuery"));
    }

    @Test
    public void titleTest() {
        Document document = new Document("http://example.com");
        assertNull(document.title());
    }

    @Test
    public void setTitleTest() {
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
        String outerHtml = document.outerHtml();
        assertNotNull(outerHtml);
    }

}