package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.Parser;

import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void expectFormTest() {
        Document document = new Document("http://example.com");
        FormElement form = document.expectForm("form.nonExistentForm");
    }

    @Test
    public void formsTest() {
        Document document = new Document("http://example.com");
        List<FormElement> forms = document.forms();

        assertNotNull(forms);
        assertTrue(forms instanceof ArrayList);
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://example.com");
        Element el = document.createElement("div");

        assertNotNull(el);
        assertEquals("div", el.tagName());
        assertTrue(el instanceof Element);
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://example.com");
        Document clone = document.clone();

        assertNotNull(clone);
        assertEquals(document.html(), clone.html());
        assertNotSame(document, clone);
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://example.com");
        Document shallowClone = document.shallowClone();

        assertNotNull(shallowClone);
        assertNotSame(document, shallowClone);
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://example.com");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);

        assertSame(outputSettings, document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://example.com");
        document.quirksMode(Document.QuirksMode.quirks);

        assertEquals(Document.QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://example.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);

        assertSame(parser, document.parser());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://example.com");
        Connection connection = mock(Connection.class);
        document.connection(connection);

        assertSame(connection, document.connection());
    }

}