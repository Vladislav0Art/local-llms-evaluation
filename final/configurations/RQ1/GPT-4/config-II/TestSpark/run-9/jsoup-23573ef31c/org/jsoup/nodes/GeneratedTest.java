package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("http://test.com");
        assertEquals("http://test.com", document.location());
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://test.com");
        assertNotNull(document.select("html"));
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://test.com");
        assertEquals("http://test.com", document.location());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("");
        assertNull(document.documentType());
    }

    @Test
    public void headTest() {
        Document document = Document.createShell("");
        assertNotNull(document.head());
    }

    @Test
    public void bodyTest() {
        Document document = Document.createShell("");
        assertNotNull(document.body());
    }

    @Test
    public void formsTest() {
        Document document = Document.createShell("");
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

    @Test
    public void expectFormTest() {
        Document document = Document.createShell("");
        document.expectForm("form");
    }

    @Test
    public void createElementTest() {
        Document document = Document.createShell("");
        Element element = document.createElement("p");
        assertEquals("p", element.nodeName());
    }

    @Test
    public void charsetTest() {
        Document document = Document.createShell("");
        document.charset(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = Document.createShell("");
        assertFalse(document.updateMetaCharsetElement());
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = Document.createShell("");
        Document clone = document.clone();
        assertEquals(document.outputSettings(), clone.outputSettings());
    }

    @Test
    public void shallowCloneTest() {
        Document document = Document.createShell("");
        Document shallowClone = document.shallowClone();
        assertEquals(document.parser(), shallowClone.parser());
    }

    @Test
    public void outputSettingsTest() {
        Document document = Document.createShell("");
        assertNotNull(document.outputSettings());
    }

    @Test
    public void parserTest() {
        Document document = Document.createShell("");
        assertEquals(Parser.htmlParser(), document.parser());
    }

    @Test
    public void quirksModeTest() {
        Document document = Document.createShell("");
        document.quirksMode(Document.QuirksMode.quirks);
        assertEquals(Document.QuirksMode.quirks, document.quirksMode());
    }

}