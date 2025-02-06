package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

public class GeneratedTest {

    @Test
    public void createShellDocument() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
    }

    @Test
    public void locationReturnsBaseUri() {
        String baseUri = "https://example.com";
        Document document = Document.createShell(baseUri);
        assertEquals(baseUri, document.location());
    }

    @Test
    public void connectionReturnsJsoupConnection() {
        Connection connection = Jsoup.connect("https://example.com");
        Document document = Document.createShell(connection.uri());
        assertNotNull(document.connection());
    }

    @Test
    public void expectFormReturnsExpectedForm() {
        String cssQuery = "form";
        FormElement form = new FormElement();
        Document document = Document.createShell("https://example.com");
        FormElement expectedForm = document.expectForm(cssQuery);
        assertEquals(form, expectedForm);
    }

    @Test
    public void titleSetsTitle() {
        Document document = Document.createShell("https://example.com");
        String title = "New Title";
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void createElementCreatesElement() {
        String tagName = "div";
        Element element = document.createElement(tagName);
        assertNotNull(element);
    }

    @Test
    public void outerHtmlReturnsOuterHtml() {
        Document document = Document.createShell("https://example.com");
        String html = document.outerHtml();
        assertNotNull(html);
    }

    @Test
    public void textSetsText() {
        Document document = Document.createShell("https://example.com");
        String text = "New Text";
        document.text(text);
        assertEquals(text, document.text());
    }

    @Test
    public void nodeNameReturnsNodeName() {
        Document document = Document.createShell("https://example.com");
        String nodeName = document.nodeName();
        assertNotNull(nodeName);
    }

    @Test
    public void charsetSetsCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = Document.createShell("https://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElementUpdatesMetaCharsetElement() {
        Document document = Document.createShell("https://example.com");
        boolean update = true;
        document.updateMetaCharsetElement(update);
        assertTrue(document.updateMetaCharsetElement());
    }

}