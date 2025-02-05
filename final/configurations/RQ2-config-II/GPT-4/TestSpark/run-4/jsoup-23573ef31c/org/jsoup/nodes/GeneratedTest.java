package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document document = Document.createShell("https://www.example.com");
        Assert.assertEquals("https://www.example.com", document.location());
    }

    @Test
    public void locationTest() {
        Document document = new Document("https://www.example.com");
        Assert.assertEquals("https://www.example.com", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("https://www.example.com");
        Connection connection = Mockito.mock(Connection.class);
        document.connection(connection);
        Assert.assertEquals(connection, document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("https://www.example.com");
        DocumentType documentType = document.documentType();
        Assert.assertNull(documentType);
    }

    @Test
    public void headBodyTest() {
        Document document = Document.createShell("https://www.example.com");
        Assert.assertNotNull(document.head());
        Assert.assertNotNull(document.body());
    }

    @Test
    public void formsTest() {
        Document document = new Document("https://www.example.com");
        List<FormElement> forms = document.forms();
        Assert.assertNotNull(forms);
    }

    @Test
    public void expectFormTest() {
        Document document = new Document("https://www.example.com");
        document.expectForm("form");
    }

    @Test
    public void titleTest() {
        Document document = Document.createShell("https://www.example.com");
        document.title("Test title");
        Assert.assertEquals("Test title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("https://www.example.com");
        Element element = document.createElement("p");
        Assert.assertEquals("p", element.nodeName());
    }

    @Test
    public void outerHtmlTest() {
        Document document = Document.createShell("https://www.example.com");
        String html = document.outerHtml();
        Assert.assertNotNull(html);
    }

    @Test
    public void textTest() {
        Document document = new Document("https://www.example.com");
        document.text("Test text");
        Assert.assertEquals("Test text", document.text());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("https://www.example.com");
        document.charset(Charset.forName("UTF-8"));
        Assert.assertEquals(Charset.forName("UTF-8"), document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("https://www.example.com");
        document.updateMetaCharsetElement(true);
        Assert.assertEquals(true, document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("https://www.example.com");
        Document clone = document.clone();
        Assert.assertNotSame(document, clone);
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("https://www.example.com");
        Document clone = document.shallowClone();
        Assert.assertNotSame(document, clone);
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("https://www.example.com");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("https://www.example.com");
        document.quirksMode(QuirksMode.quirks);
        Assert.assertEquals(QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = new Document("https://www.example.com");
        Parser parser = new Parser(new Document("https://www.example.com"));
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

}