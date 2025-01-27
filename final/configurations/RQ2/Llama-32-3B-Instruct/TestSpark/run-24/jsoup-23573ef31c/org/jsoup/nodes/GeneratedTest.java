package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void createShellBasicTest() {
        Document document = Document.createShell("http://example.com");
        org.junit.Assert.assertNotNull(document);
    }

    @Test
    public void createShellWithBaseUriTest() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        org.junit.Assert.assertEquals(baseUri, document.baseUri());
    }

    @Test
    public void locationBasicTest() {
        Document document = new Document("http://example.com");
        org.junit.Assert.assertEquals("http://example.com", document.location());
    }

    @Test
    public void connectionBasicTest() {
        Connection connection = Jsoup.connect("http://example.com");
        Document document = connection.get();
        org.junit.Assert.assertNotNull(document);
        org.junit.Assert.assertTrue(connection.eq(document.connection()));
    }

    @Test
    public void documentTypeBasicTest() {
        Document document = new Document("http://example.com");
        org.junit.Assert.assertNull(document.documentType());
    }

    @Test
    public void headBasicTest() {
        Document document = new Document("http://example.com");
        Element headElement = document.head();
        org.junit.Assert.assertNotNull(headElement);
    }

    @Test
    public void bodyBasicTest() {
        Document document = new Document("http://example.com");
        Element bodyElement = document.body();
        org.junit.Assert.assertNotNull(bodyElement);
    }

    @Test
    public void formsBasicTest() {
        Document document = new Document("http://example.com");
        List<FormElement> formElements = document.forms();
        org.junit.Assert.assertTrue(formElements.isEmpty());
    }

    @Test
    public void expectFormBasicTest() {
        Document document = new Document("http://example.com");
        FormElement formElement = document.expectForm("*");
        org.junit.Assert.assertNotNull(formElement);
    }

    @Test
    public void titleBasicTest() {
        Document document = new Document("http://example.com");
        String title = document.title();
        org.junit.Assert.assertEquals("", title);
    }

    @Test
    public void titleSetBasicTest() {
        Document document = new Document("http://example.com");
        document.title("Test Title");
        String title = document.title();
        org.junit.Assert.assertEquals("Test Title", title);
    }

    @Test
    public void createElementBasicTest() {
        Document document = new Document("http://example.com");
        Element element = document.createElement("div");
        org.junit.Assert.assertNotNull(element);
    }

    @Test
    public void outerHtmlBasicTest() {
        Document document = new Document("http://example.com");
        String html = document.outerHtml();
        org.junit.Assert.assertEquals("", html);
    }

    @Test
    public void textBasicTest() {
        Document document = new Document("http://example.com");
        String text = document.text("Test Text");
        org.junit.Assert.assertEquals("Test Text", text);
    }

    @Test
    public void nodeNameBasicTest() {
        Document document = new Document("http://example.com");
        String nodeName = document.nodeName();
        org.junit.Assert.assertEquals("", nodeName);
    }

    @Test
    public void charsetBasicTest() {
        Document document = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        Charset actualCharset = document.charset();
        org.junit.Assert.assertEquals(charset, actualCharset);
    }

    @Test
    public void updateMetaCharsetElementBasicTest() {
        Document document = new Document("http://example.com");
        boolean updated = document.updateMetaCharsetElement();
        org.junit.Assert.assertTrue(updated);
    }

    @Test
    public void cloneBasicTest() {
        Document document = new Document("http://example.com");
        Document clonedDocument = document.clone();
        org.junit.Assert.assertNotNull(clonedDocument);
    }

    @Test
    public void shallowCloneBasicTest() {
        Document document = new Document("http://example.com");
        Document shallowClonedDocument = document.shallowClone();
        org.junit.Assert.assertNotNull(shallowClonedDocument);
    }

    @Test
    public void outputSettingsBasicTest() {
        Document document = new Document("http://example.com");
        OutputSettings settings = document.outputSettings();
        org.junit.Assert.assertNull(settings);
    }

    @Test
    public void outputSettingsSetBasicTest() {
        Document document = new Document("http://example.com");
        OutputSettings settings = new OutputSettings();
        document.outputSettings(settings);
        OutputSettings actualSettings = document.outputSettings();
        org.junit.Assert.assertEquals(settings, actualSettings);
    }

    @Test
    public void quirksModeBasicTest() {
        Document document = new Document("http://example.com");
        QuirksMode quirksMode = document.quirksMode();
        org.junit.Assert.assertNull(quirksMode);
    }

    @Test
    public void parserBasicTest() {
        Document document = new Document("http://example.com");
        Parser parser = document.parser();
        org.junit.Assert.assertNull(parser);
    }

}