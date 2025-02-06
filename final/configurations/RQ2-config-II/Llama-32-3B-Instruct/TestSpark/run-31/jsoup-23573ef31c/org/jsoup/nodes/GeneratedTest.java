package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTest {

    @Test
    public void createShellDocument_test() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
        assertTrue(document instanceof Document);
    }

    @Test
    public void locationDocument_test() {
        Document document = Document.createShell("http://example.com");
        String location = document.location();
        assertEquals("", location);
    }

    @Test
    public void connectionDocument_test() {
        Connection connection = new Connection();
        Document document = Document.createShell("http://example.com").connection(connection);
        assertNotNull(document.connection());
        assertTrue(document.connection() == connection);
    }

    @Test
    public void documentTypeDocument_test() {
        Document document = Document.createShell("http://example.com");
        DocumentType documentType = document.documentType();
        assertNull(documentType);
    }

    @Test
    public void headElement_test() {
        Document document = Document.createShell("http://example.com");
        Element head = document.head();
        assertNotNull(head);
        assertTrue(head instanceof Element);
    }

    @Test
    public void bodyElement_test() {
        Document document = Document.createShell("http://example.com");
        Element body = document.body();
        assertNotNull(body);
        assertTrue(body instanceof Element);
    }

    @Test
    public void formsElements_test() {
        Document document = Document.createShell("http://example.com");
        List<FormElement> forms = document.forms();
        assertFalse(forms.isEmpty());
        assertTrue(forms.size() > 0);
    }

    @Test
    public void expectForm_element_test() {
        Document document = Document.createShell("http://example.com");
        FormElement form = document.expectForm("*");
        assertNotNull(form);
        assertTrue(form instanceof FormElement);
    }

    @Test
    public void title_string_test() {
        String title = "Hello World";
        Document document = Document.createShell("http://example.com").title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void createElement_element_test() {
        Document document = Document.createShell("http://example.com");
        Element element = document.createElement("div");
        assertNotNull(element);
        assertTrue(element instanceof Element);
    }

    @Test
    public void outerHtmlDocument_test() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(html).documentElement();
        String outerHtml = document.outerHtml();
        assertEquals(html, outerHtml);
    }

    @Test
    public void textString_test() {
        String text = "Hello World!";
        Element element = new Element("p");
        Document document = Document.createShell("http://example.com").text(text).element(element);
        assertEquals(text, document.text());
    }

    @Test
    public void nodeNameElement_test() {
        Element element = new Element("div");
        Document document = Document.createShell("http://example.com").createElement("div").element(element);
        String nodeName = document.nodeName();
        assertEquals(element.tagName(), nodeName);
    }

    @Test
    public void charsetCharset_test() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Document.createShell("http://example.com").charset(charset);
        assertNotNull(document.charset());
        assertTrue(document.charset() == charset);
    }

    @Test
    public void updateMetaCharsetElement_boolean_test() {
        Document document = Document.createShell("http://example.com");
        boolean update = true;
        document.updateMetaCharsetElement(update);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void shallowCloneDocument_test() {
        Document original = Document.createShell("http://example.com");
        Document cloned = original.shallowClone();
        assertNotNull(cloned);
        assertTrue(cloned instanceof Document);
    }

    @Test
    public void outputSettingsOutputSettings_test() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = Document.createShell("http://example.com").outputSettings(outputSettings);
        assertEquals(outputSettings, document.outputSettings());
    }

    @Test
    public void quirksModeQuirksMode_test() {
        QuirksMode quirksMode = QuirksMode.LOWEST;
        Document document = Document.createShell("http://example.com");
        document.quirksMode(quirksMode);
        assertEquals(quirksMode, document.quirksMode());
    }

    @Test
    public void parserParser_test() {
        Parser parser = new Parser();
        Document document = Document.createShell("http://example.com").parser(parser);
        assertNotNull(document.parser());
        assertTrue(document.parser() == parser);
    }

}