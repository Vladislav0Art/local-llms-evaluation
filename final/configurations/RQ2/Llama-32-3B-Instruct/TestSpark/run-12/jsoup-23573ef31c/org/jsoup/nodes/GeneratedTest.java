package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;

public class GeneratedTest {

    @Test
    public void createShell() {
        String baseUri = "https://example.com";
        Document doc = Document.createShell(baseUri);
        assertNotNull(doc);
    }

    @Test
    public void locationReturnsCorrectLocation() {
        String baseUri = "https://example.com";
        Document doc = Document.createShell(baseUri);
        assertEquals(baseUri, doc.location());
    }

    @Test
    public void connectionReturnsCorrectConnection() {
        String baseUri = "https://example.com";
        Connection conn = new Connection();
        Document doc = Document.createShell(baseUri).connection(conn);
        assertNotNull(doc.connection());
    }

    @Test
    public void titleSetsAndGetsTitleCorrectly() {
        String title = "Example Title";
        Document doc = new Document();
        doc.title(title);
        assertEquals(title, doc.title());
    }

    @Test
    public void createElementCreatesNewElementCorrectly() {
        String tagName = "div";
        Element elem = new Document().createElement(tagName);
        assertNotNull(elem);
        assertEquals(tagName, elem.nodeName());
    }

    @Test
    public void outerHtmlReturnsCorrectOuterHTML() {
        String html = "<html><body>Hello World!</body></html>";
        Document doc = Jsoup.parse(html).documentElement();
        assertEquals(html, doc.outerHtml());
    }

    @Test
    public void textSetsAndGetsTextCorrectly() {
        String text = "Example Text";
        Document doc = new Document();
        Element elem = doc.createElement("div");
        elem.text(text);
        assertEquals(text, elem.text());
    }

    @Test
    public void charsetSetsCharsetCorrectly() {
        Charset charset = Charset.forName("UTF-8");
        Document doc = new Document();
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

    @Test
    public void updateMetaCharsetElementUpdatesCharsetCorrectly() {
        boolean update = true;
        Document doc = new Document();
        doc.updateMetaCharsetElement(update);
        assertTrue(doc.updateMetaCharsetElement());
    }

    @Test
    public void formsReturnsFormsCorrectly() {
        String cssQuery = "div";
        List<FormElement> forms = new Document().forms(cssQuery);
        assertNotNull(forms);
    }

    @Test
    public void expectFormSelectsFormCorrectly() {
        String cssQuery = "div";
        FormElement form = new Document().expectForm(cssQuery);
        assertNotNull(form);
    }

    @Test
    public void outputSettingsReturnsOutputSettingsCorrectly() {
        OutputSettings settings = new OutputSettings();
        Document doc = new Document();
        doc.outputSettings(settings);
        assertEquals(settings, doc.outputSettings());
    }

    @Test
    public void quirksModeSetsAndGetsQuirksModeCorrectly() {
        QuirksMode mode = QuirksMode.Browser;
        Document doc = new Document();
        doc.quirksMode(mode);
        assertEquals(mode, doc.quirksMode());
    }

    @Test
    public void parserReturnsParserCorrectly() {
        Parser parser = new Parser();
        Document doc = new Document();
        doc.parser(parser);
        assertNotNull(doc.parser());
    }

}