package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

import java.util.ArrayList;

import org.jsoup.Connection;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void constructorTest() {
        String baseUri = "https://example.com";
        assertNull(Document.createShell(baseUri).location());
    }

    @Test
    public void locationTest() {
        Connection connection = Mockito.mock(Connection.class);
        Document document = Document.createShell("https://example.com");
        assertEquals(document.location(), connection.connect().getLocation());
    }

    @Test
    public void createShellTest() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

    @Test
    public void expectFormTest() {
        List<FormElement> forms = new ArrayList<>();
        forms.add(new FormElement());
        Document document = Document.createShell("https://example.com");
        assertEquals(forms, document.forms());
    }

    @Test
    public void titleTest() {
        String title = "Example Title";
        Document document = Document.createShell("https://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void createElementTest() {
        Document document = Document.createShell("https://example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
    }

    @Test
    public void cloneTest() {
        Document document = Document.createShell("https://example.com");
        Document clonedDocument = document.clone();
        assertNotSame(document, clonedDocument);
    }

    @Test
    public void shallowCloneTest() {
        Document document = Document.createShell("https://example.com");
        Document shallowClonedDocument = document.shallowClone();
        assertNotSame(document, shallowClonedDocument);
    }

    @Test
    public void charsetTest() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals("UTF-8", document.charset());
        document.charset(Charset.forName("iso-8859-1"));
        assertEquals(Charset.forName("iso-8859-1"), document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = Document.createShell("https://example.com");
        boolean updated = document.updateMetaCharsetElement();
        assertTrue(updated);
    }

}