package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void createShell() {
        String baseUri = "";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

    @Test
    public void location() {
        String baseUri = "";
        Document document = new Document(baseUri);
        assertEquals("", document.location());
    }

    @Test
    public void connection() {
        String baseUri = "";
        Document document = new Document(baseUri);
        assertNull(document.connection());
    }

    @Test
    public void documentType() {
        String baseUri = "";
        Document document = new Document(baseUri);
        assertNull(document.documentType());
    }

    @Test
    public void head() {
        String baseUri = "";
        Document document = new Document(baseUri);
        assertNotNull(document.head());
    }

    @Test
    public void body() {
        String baseUri = "";
        Document document = new Document(baseUri);
        assertNotNull(document.body());
    }

    @Test
    public void forms() {
        String baseUri = "";
        Document document = new Document(baseUri);
        assertNotNull(document.forms());
    }

    @Test
    public void expectForm() {
        String baseUri = "";
        Document document = new Document(baseUri);
        String cssQuery = "";
        assertNotNull(document.expectForm(cssQuery));
    }

    @Test
    public void title() {
        String baseUri = "";
        Document document = new Document(baseUri);
        assertEquals("", document.title());
    }

}