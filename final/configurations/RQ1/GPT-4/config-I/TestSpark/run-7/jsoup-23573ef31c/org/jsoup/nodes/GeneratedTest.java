package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("http://example.com");
        assertNotNull(document);
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
        assertEquals("html", document.childNode(0).nodeName());
    }

    @Test
    public void createShellNullBaseUriTest() {
        Document.createShell(null);
    }

    @Test
    public void titleTest() {
        Document document = Document.createShell("http://example.com");
        document.title("Test Title");
        assertEquals("Test Title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
        assertEquals("div", element.nodeName());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://example.com");
        document.charset(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://example.com");
        assertFalse(document.updateMetaCharsetElement());
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://example.com");
        Document clonedDocument = document.clone();
        assertNotNull(clonedDocument);
        assertEquals(document.location(), clonedDocument.location());
    }

    @Test
    public void formsTest() {
        Document document = Jsoup.parse("<form id='form1'><input name='city' /></form><form id='form2'></form>");
        List<FormElement> forms = document.forms();
        assertEquals(2, forms.size());
        assertEquals("form1", forms.get(0).id());
        assertEquals("form2", forms.get(1).id());
    }

    @Test
    public void expectFormTest() {
        Document document = Jsoup.parse("<form id='form1'><input name='city' /></form><form id='form2'></form>");
        FormElement formElement = document.expectForm("#form1");
        assertNotNull(formElement);
        assertEquals("form1", formElement.id());
    }

    @Test
    public void expectFormNoMatchTest() {
        Document document = Jsoup.parse("<form id='form1'><input name='city' /></form><form id='form2'></form>");
        document.expectForm("#form3");
    }

}