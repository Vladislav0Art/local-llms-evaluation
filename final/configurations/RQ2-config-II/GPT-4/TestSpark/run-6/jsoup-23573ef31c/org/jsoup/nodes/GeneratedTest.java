package org.jsoup.nodes;

import org.jsoup.Connection;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("http://localhost");
        Assert.assertNotNull(document);
    }

    @Test
    public void createShellBaseUriTest() {
        Document document = Document.createShell("http://localhost");
        Assert.assertNotNull(document);
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://localhost");
        Assert.assertEquals("http://localhost", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://localhost");
        Assert.assertNotNull(document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("http://localhost");
        Assert.assertNull(document.documentType());
    }

    @Test
    public void headTest() {
        Document document = new Document("http://localhost");
        Assert.assertNotNull(document.head());
    }

    @Test
    public void bodyTest() {
        Document document = new Document("http://localhost");
        Assert.assertNotNull(document.body());
    }

    @Test
    public void formsTest() {
        Document document = new Document("http://localhost");
        List<FormElement> forms = document.forms();
        Assert.assertNotNull(forms);
    }

    @Test
    public void expectFormCssQueryTest() {
        Document document = new Document("http://localhost");
        document.expectForm("#form1");
    }

    @Test
    public void titleTest() {
        Document document = new Document("http://localhost");
        Assert.assertEquals("", document.title());
    }

    @Test
    public void titleSetTest() {
        Document document = new Document("http://localhost");
        document.title("Test Title");
        Assert.assertEquals("Test Title", document.title());
    }

    @Test
    public void createElementTagNameTest() {
        Document document = new Document("http://localhost");
        Element element = document.createElement("div");
        Assert.assertNotNull(element);
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("http://localhost");
        Assert.assertNotNull(document.outerHtml());
    }

    @Test
    public void textTest() {
        Document document = new Document("http://localhost");
        Assert.assertNotNull(document.text("Test Document"));
    }

    @Test
    public void nodeNameTest() {
        Document document = new Document("http://localhost");
        Assert.assertEquals("#document", document.nodeName());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://localhost");
        Assert.assertEquals(Charset.forName("UTF-8"), document.charset());
    }

    @Test
    public void charsetSetTest() {
        Document document = new Document("http://localhost");
        document.charset(Charset.forName("UTF-16"));
        Assert.assertEquals(Charset.forName("UTF-16"), document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://localhost");
        Assert.assertFalse(document.updateMetaCharsetElement());
    }

    @Test
    public void updateMetaCharsetElementSetTest() {
        Document document = new Document("http://localhost");
        document.updateMetaCharsetElement(true);
        Assert.assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://localhost");
        Assert.assertNotSame(document, document.clone());
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("http://localhost");
        Assert.assertNotSame(document, document.shallowClone());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://localhost");
        Assert.assertNotNull(document.outputSettings());
    }

    @Test
    public void outputSettingsSetTest() {
        Document document = new Document("http://localhost");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://localhost");
        Assert.assertEquals(Document.QuirksMode.noQuirks, document.quirksMode());
    }

    @Test
    public void quirksModeSetTest() {
        Document document = new Document("http://localhost");
        document.quirksMode(Document.QuirksMode.quirky);
        Assert.assertEquals(Document.QuirksMode.quirky, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://localhost");
        Assert.assertNotNull(document.parser());
    }

    @Test
    public void parserSetTest() {
        Document document = new Document("http://localhost");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

    @Test
    public void connectionSetTest() {
        Document document = new Document("http://localhost");
        Connection connection = Mockito.mock(Connection.class);
        document.connection(connection);
        Assert.assertNotNull(document.connection());
    }

}