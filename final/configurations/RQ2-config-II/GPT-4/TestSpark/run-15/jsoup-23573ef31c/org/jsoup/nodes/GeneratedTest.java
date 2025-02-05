package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Document document = new Document("baseUri");
        assertEquals("baseUri", document.baseUri());
    }

    @Test
    public void createShellTest() {
        Document shell = Document.createShell("shellUri");
        assertEquals("shellUri", shell.baseUri());
    }

    @Test
    public void locationTest() {
        Document document = new Document("locationUri");
        assertEquals("locationUri", document.location());
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
        DocumentType type = document.documentType();
        assertNull(type);
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
    public void titleTest() {
        Document document = new Document("http://localhost");
        String title = document.title();
        assertEquals("", title);
    }

    @Test
    public void setTitleTest() {
        Document document = new Document("http://localhost");
        document.title("Test Title");
        assertEquals("Test Title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://localhost");
        Element element = document.createElement("p");
        assertEquals("p", element.tagName());
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("http://localhost");
        String html = document.outerHtml();
        assertNotNull(html);
    }

    @Test
    public void textTest() {
        Document document = new Document("http://localhost");
        Element textElement = document.text("Test Text");
        assertEquals("Test Text", textElement.text());
    }

    @Test
    public void nodeNameTest() {
        Document document = new Document("http://localhost");
        assertEquals("#document", document.nodeName());
    }

    @Test
    public void setCharsetTest() {
        Document document = new Document("http://localhost");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

    @Test
    public void cloneTest() {
        Document original = new Document("http://localhost");
        Document clone = original.clone();
        assertFalse(original == clone);
    }

}