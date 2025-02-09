package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedTest {

    @Test
    public void createShellDocTest() throws IOException {
        Document document = Document.createShell("https://www.example.com");
        assertNotNull(document);
    }

    @Test
    public void locationMethodTest() {
        Document document = new Document();
        assertEquals(null, document.location());
    }

    @Test
    public void connectionMethodTest() {
        Connection connection = new Connection();
        Document document = Document.createShell(connection.toString());
        assertNotNull(document.connection());
    }

    @Test
    public void headElementTest() {
        Document document = new Document();
        Element head = document.head();
        assertSame(head, document.createElement("head").element());
    }

    @Test
    public void bodyElementTest() {
        Document document = new Document();
        Element body = document.body();
        assertSame(body, document.createElement("body").element());
    }

    @Test
    public void formsMethodTest() {
        List<FormElement> forms = new ArrayList<>();
        Document document = new Document();
        FormElement form = document.forms().get(0);
        assertNotNull(form);
    }

    @Test
    public void expectFormMethodTest() {
        Document document = new Document();
        Element element = document.createElement("div");
        FormElement form = document.expectForm(element.toString());
        assertNotNull(form);
    }

    @Test
    public void titleMethodTest() {
        Document document = new Document();
        assertEquals(null, document.title());
    }

    @Test
    public void titleSetterTest() {
        Document document = new Document();
        document.title("test");
        assertEquals("test", document.title());
    }

    @Test
    public void createElementMethodTest() throws IOException {
        Document document = new Document();
        Element element = document.createElement("div").element();
        assertNotNull(element);
    }

    @Test
    public void outerHtmlMethodTest() {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(html).documentElement();
        assertEquals(html, document.outerHtml());
    }

    @Test
    public void textSetterTest() throws IOException {
        String html = "<html><body>Hello <span>World!</span></body></html>";
        Document document = Jsoup.parse(html).documentElement();
        Document parsedDoc = Jsoup.parse(document.outerHtml()).documentElement();
        assertEquals("Hello World!", parsedDoc.text());
    }

    @Test
    public void nodeNameMethodTest() {
        Document document = new Document();
        assertEquals(null, document.nodeName());
    }

    @Test
    public void charsetSetterTest() throws IOException {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document();
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElementMethodTest() {
        boolean update = true;
        Document document = new Document();
        document.updateMetaCharsetElement(update);
        assertTrue(update);
    }

    @Test
    public void outputSettingsSetterTest() throws IOException {
        OutputSettings settings = new OutputSettings();
        Document document = new Document();
        document.outputSettings(settings);
        assertEquals(settings, document.outputSettings());
    }

    @Test
    public void shallowCloneMethodTest() throws IOException {
        String html = "<html><body>Hello World!</body></html>";
        Document document = Jsoup.parse(html).documentElement().clone();
        Document parsedDoc = Jsoup.parse(document.outerHtml()).documentElement();
        assertEquals(html, parsedDoc.outerHtml());
    }

    @Test
    public void quirksModeSetterTest() throws IOException {
        QuirksMode mode = QuirksMode.COE; // Default value
        Document document = new Document();
        document.quirksMode(mode);
        assertEquals(mode, document.quirksMode());
    }

    @Test
    public void parserSetterTest() throws IOException {
        Parser parser = new Parser();
        Document document = new Document();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}