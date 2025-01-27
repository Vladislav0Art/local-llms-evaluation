package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.nio.charset.Charset;

public class GeneratedTest {

    public static class Connection {
        public String getUri() {
            return "http://example.com";
        }
    }

    @Test
    public void createShellWithBaseUri() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

    @Test
    public void titleSetsTitle() {
        String title = "Hello World";
        Document document = new Document("http://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void cloneReturnsShallowClone() {
        Document original = new Document("http://example.com");
        Document cloned = original.clone();
        assertTrue(cloned instanceof Document);
    }

    @Test
    public void shallowCloneReturnsCloningObject() {
        Document document = new Document("http://example.com");
        Document cloned = document.shallowClone();
        assertNotEquals(document, cloned);
    }

    @Test
    public void createShellWithValidUrl() {
        String url = "http://example.com";
        Document document = Document.createShell(url);
        assertNotNull(document);
    }

    @Test
    public void createFormElementWithCssQuery() {
        String cssQuery = "form";
        FormElement form = Document.createShell("http://example.com").expectForm(cssQuery);
        assertNotNull(form);
    }

    @Test
    public void newDocumentWithBaseUri() {
        Connection connection = new Connection();
        Document document = Document.createShell(connection.getUri());
        assertNotNull(document);
    }

    @Test
    public void locationReturnsBaseUri() {
        Connection connection = new Connection();
        Document document = Document.createShell(connection.getUri());
        assertEquals(connection.getUri(), document.location());
    }

    @Test
    public void connectionReturnsConnection() {
        Connection connection = new Connection();
        Document document = Document.createShell(connection.getUri());
        assertEquals(connection, document.connection());
    }

    @Test
    public void createShellWithValidUrl() {
        String url = "http://example.com";
        Document document = new Document(url);
        assertNotNull(document);
    }

    @Test
    public void locationReturnsBaseUri() {
        Connection connection = new Connection();
        Document document = new Document(connection.getUri());
        assertEquals(connection.getUri(), document.location());
    }

}