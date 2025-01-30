package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    private static final String BASE_URI = "http://example.com/";

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document(BASE_URI);
        assertNotNull(document);
        assertEquals(document.location(), BASE_URI);
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell(BASE_URI);
        assertNotNull(document);
        assertEquals(document.location(), BASE_URI);
    }

    @Test
    public void locationTest() {
        Document document = new Document(BASE_URI);
        assertEquals(document.location(), BASE_URI);
    }

    @Test
    public void connectionWithOutPreviousConnectionTest() {
        Document document = new Document(BASE_URI);
        Connection connection = document.connection();
        assertNotNull(connection);
    }

    @Test
    public void connectionWithPreviousConnectionTest() {
        Connection previousConnection = mock(Connection.class);
        Document document = new Document(BASE_URI);
        document.connection(previousConnection);
        assertEquals(document.connection(), previousConnection);
    }

    @Test
    public void documentTypeWhenDocumentTypeDoesntExistTest() {
        Document document = new Document(BASE_URI);
        assertNull(document.documentType());
    }

    @Test
    public void headTest() {
        Document document = new Document(BASE_URI);
        Element headEl = document.appendElement("html").appendElement("head");
        assertEquals(headEl, document.head());
    }

    @Test
    public void bodyTest() {
        Document document = new Document(BASE_URI);
        Element bodyEl = document.appendElement("html").appendElement("body");
        assertEquals(bodyEl, document.body());
    }

    @Test
    public void formsTest() {
        Document document = new Document(BASE_URI);
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

    @Test
    public void expectFormWhenFormDoesntExistTest() {
        Document document = new Document(BASE_URI);
        document.expectForm("form");
    }

    @Test
    public void titleWhenTitleDoesntExistTest() {
        Document document = new Document(BASE_URI);
        assertTrue(document.title().isEmpty());
    }

    @Test
    public void titleWhenTitleExistsTest() {
        Document document = new Document(BASE_URI);
        String titleName = "testTitle";
        document.appendElement("html").appendElement("head").appendElement("title").text(titleName);
        assertEquals(document.title(), titleName);
    }

    @Test
    public void createElementTest() {
        Document document = new Document(BASE_URI);
        Element element = document.createElement("div");
        assertNotNull(element);
        assertEquals(element.tagName(), "div");
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document(BASE_URI);
        Element element = document.createElement("div");
        assertEquals(document.outerHtml(), "");
        document.appendChild(element);
        assertEquals(document.outerHtml(), "<div></div>\n");
    }

    @Test
    public void textTest() {
        Document document = new Document(BASE_URI);
        String text = "Test text";
        document.text(text);
        assertEquals(document.body().text(), text);
    }

    @Test
    public void nodeNameTest() {
        Document document = new Document(BASE_URI);
        assertEquals(document.nodeName(), "#document");
    }

    @Test
    public void charsetTest() {
        Document document = new Document(BASE_URI);
        document.charset(Charset.defaultCharset());
        assertEquals(document.charset(), Charset.defaultCharset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document(BASE_URI);
        assertFalse(document.updateMetaCharsetElement());
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Document document = new Document(BASE_URI);
        Document cloned = document.clone();
        assertFalse(document == cloned);
        assertEquals(document.outputSettings().charset(), cloned.outputSettings().charset());
        assertEquals(document.updateMetaCharsetElement(), cloned.updateMetaCharsetElement());
    }

    @Test
    public void shallowCloneTest() throws CloneNotSupportedException {
        Document document = new Document(BASE_URI);
        Document shallowCloned = document.shallowClone();
        assertNotNull(shallowCloned);
        assertNotEquals(document, shallowCloned);
    }

}