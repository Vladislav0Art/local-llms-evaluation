package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        Document document = new Document("http://baseUri");
        assertNotNull(document);
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://baseUri");
        assertNotNull(document);
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://baseUri");
        assertEquals("http://baseUri", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://baseUri");
        assertNull(document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("http://baseUri");
        assertNull(document.documentType());
    }

    @Test
    public void headTest() {
        Document document = new Document("http://baseUri");
        assertNotNull(document.head());
    }

    @Test
    public void bodyTest() {
        Document document = new Document("http://baseUri");
        assertNotNull(document.body());
    }

    @Test
    public void formsTest() {
        Document document = new Document("http://baseUri");
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
    }

    @Test
    public void expectFormTest() {
        Document document = new Document("http://baseUri");
        FormElement formElement = document.expectForm("form");
        assertNull(formElement);
    }

    @Test
    public void titleTest() {
        Document document = new Document("http://baseUri");
        document.title("Title");
        assertEquals("Title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://baseUri");
        Element element = document.createElement("tag");
        assertNotNull(element);
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("http://baseUri");
        assertNotNull(document.outerHtml());
    }

    @Test
    public void textTest() {
        Document document = new Document("http://baseUri");
        document.text("Text");
        assertEquals("Text", document.text());
    }

    @Test
    public void nodeNameTest() {
        Document document = new Document("http://baseUri");
        assertNotNull(document.nodeName());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://baseUri");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://baseUri");
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://baseUri");
        Document clone = document.clone();
        assertNotNull(clone);
        assertEquals(document.location(), clone.location());
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://baseUri");
        Document clone = document.shallowClone();
        assertNotNull(clone);
        assertEquals(document.location(), clone.location());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://baseUri");
        assertNotNull(document.outputSettings());
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://baseUri");
        assertNotNull(document.parser());
    }

    @Test
    public void parserSetTest() {
        Document document = new Document("http://baseUri");
        Parser parser = Parser.htmlParser();
        document = document.parser(parser);
        assertEquals(parser, document.parser());
    }

}