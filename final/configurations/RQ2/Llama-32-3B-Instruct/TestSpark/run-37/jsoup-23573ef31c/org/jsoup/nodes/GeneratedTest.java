package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.DataUtil;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void createShellDocument() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
    }

    @Test
    public void locationMethodReturnsUri() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void connectionMethodReturnsConnectionObject() {
        Connection connection = Jsoup.connect("http://example.com");
        Document document = new Document(connection.getUri());
        assertEquals(connection, document.connection());
    }

    @Test
    public void expectFormMethodReturnsFormElement() {
        Selector selector = "input[type='text']";
        FormElement form = new Document().expectForm(selector);
        assertNotNull(form);
    }

    @Test
    public void titleSetAndGetMethods() {
        Document document = new Document();
        document.title("Title");
        assertEquals("Title", document.title());
    }

    @Test
    public void createElementMethodReturnsElement() {
        Element element = new Document().createElement("div");
        assertNotNull(element);
    }

    @Test
    public void outerHtmlMethodReturnsString() {
        Document document = new Document();
        document.createElement("div").appendText("Hello World!");
        assertEquals("<div>Hello World!</div>", document.outerHtml());
    }

    @Test
    public void textMethodSetsAndGetsString() {
        String text = "Hello World!";
        Document document = new Document();
        document.text(text);
        assertEquals(text, document.text());
    }

    @Test
    public void nodeNameMethodReturnsString() {
        Document document = new Document();
        document.createElement("div").appendText("Hello World!");
        assertEquals("DIV", document.nodeName());
    }

    @Test
    public void charsetSetAndGetMethods() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document();
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElementMethodSetsBoolean() {
        boolean updated = false;
        Document document = new Document();
        document.updateMetaCharsetElement(true, updated);
        assertTrue(updated);
    }

    @Test
    public void updateMetaCharsetElementMethodReturnsBoolean() {
        boolean updated = false;
        Document document = new Document();
        document.updateMetaCharsetElement(updated);
        assertEquals(false, document.updateMetaCharsetElement());
    }

    @Test
    public void cloneMethodReturnsDocument() {
        Document document = new Document();
        Document cloned = document.clone();
        assertNotNull(cloned);
    }

    @Test
    public void shallowCloneMethodReturnsDocument() {
        Document document = new Document();
        Document cloned = document.shallowClone();
        assertNotNull(cloned);
    }

    @Test
    public void outputSettingsSetAndGetMethods() {
        OutputSettings settings = new OutputSettings();
        Document document = new Document();
        document.outputSettings(settings);
        assertEquals(settings, document.outputSettings());
    }

    @Test
    public void quirksModeSetAndGetMethods() {
        QuirksMode mode = QuirksMode.CLOSE;
        Document document = new Document();
        document.quirksMode(mode);
        assertEquals(mode, document.quirksMode());
    }

    @Test
    public void parserSetAndGetMethods() {
        Parser parser = new Parser();
        Document document = new Document();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}