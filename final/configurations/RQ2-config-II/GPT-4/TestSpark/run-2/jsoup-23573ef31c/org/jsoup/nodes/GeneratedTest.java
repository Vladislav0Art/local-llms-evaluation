package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Connection;
import org.jsoup.nodes.*;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("http://example.com");
        Assert.assertEquals("http://example.com", document.location());
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://example.com");
        Assert.assertNotNull(document);
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://example.com");
        Assert.assertEquals("http://example.com", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://example.com");
        Connection connection = document.connection();
        Assert.assertNotNull(connection);
    }

    @Test
    public void headTest() {
        Document document = Document.createShell("http://example.com");
        Assert.assertNotNull(document.head());
    }

    @Test
    public void bodyTest() {
        Document document = Document.createShell("http://example.com");
        Assert.assertNotNull(document.body());
    }

    @Test
    public void formsTest() {
        Document document = Document.createShell("http://example.com");
        List<FormElement> formElements = document.forms();
        Assert.assertNotNull(formElements);
    }

    @Test
    public void titleTest() {
        Document document = Document.createShell("http://example.com");
        document.title("testTitle");
        Assert.assertEquals("testTitle", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = Document.createShell("http://example.com");
        Element element = document.createElement("div");
        Assert.assertEquals("div", element.nodeName());
    }

    @Test
    public void outerHtmlTest() {
        Document document = Document.createShell("http://example.com");
        Assert.assertNotNull(document.outerHtml());
    }

    @Test
    public void charsetTest() {
        Document document = Document.createShell("http://example.com");
        document.charset(StandardCharsets.UTF_8);
        Assert.assertEquals(StandardCharsets.UTF_8, document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = Document.createShell("http://example.com");
        document.updateMetaCharsetElement(true);
        Assert.assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = Document.createShell("http://example.com");
        Document clonedDocument = document.clone();
        Assert.assertNotSame(document, clonedDocument);
    }

    @Test
    public void outputSettingsTest() {
        Document document = Document.createShell("http://example.com");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = Document.createShell("http://example.com");
        document.quirksMode(QuirksMode.quirks);
        Assert.assertEquals(QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = Document.createShell("http://example.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

}