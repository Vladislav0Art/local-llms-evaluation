package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.Connection;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @Test
    public void createShellDocument_ShouldReturnNewDocument() {
        String baseUri = "https://www.example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

    @Test
    public void createShellDocument_ShouldCreateEmptyDocument() {
        String baseUri = "https://www.example.com";
        Document document = Document.createShell(baseUri);
        assertTrue(document.elements().isEmpty());
    }

    @Test
    public void locationShouldReturnCorrectLocation() {
        Connection connection = Jsoup.connect("https://www.example.com");
        Document document = new Document(connection);
        assertEquals("https://www.example.com", document.location());
    }

    @Test
    public void titleShouldUpdateTitleCorrectly() {
        String title = "New Title";
        Document document = new Document();
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void createElement_ShouldReturnElementWithSameTagName() {
        String tagName = "div";
        Element element = document.createElement(tagName);
        assertNotNull(element);
        assertEquals(tagName, element.tagName());
    }

    @Test
    public void outerHtmlShouldNotBeEmptyString() {
        Document document = new Document();
        assertNotEquals("", document.outerHtml());
    }

    @Test
    public void clone_ShouldReturnNewDocument() {
        Document document = new Document();
        Document clonedDocument = document.clone();
        assertNotNull(clonedDocument);
        assertTrue(!document.equals(clonedDocument));
    }
}

public class DocumentHelper {

    public static Document createShell(String baseUri) {
        return Jsoup.connect(baseUri).getDocument();
    }

    public static String location(Document document) {
        return document.location();
    }

    public static Element createElement(Document document, String tagName) {
        return document.createElement(tagName);
    }

}