package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.junit.Assert;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTest {

    @Test
    public void DocumentCreationTest() {
        Document document = new Document("http://example.com");
        Assert.assertEquals("http://example.com", document.baseUri());
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://test.com");
        Assert.assertEquals("<html>\n <head></head>\n <body></body>\n</html>", document.toString());
    }

    @Test
    public void DocumentLocationTest() {
        Document document = new Document("http://realtest.com");
        Assert.assertEquals("http://realtest.com", document.location());
    }

    @Test
    public void headTest() {
        Document document = Document.createShell("http://anotherexample.com");
        Assert.assertNotNull(document.head());
    }

    @Test
    public void bodyTest() {
        Document document = Document.createShell("http://yetanotherexample.com");
        Assert.assertNotNull(document.body());
    }

    @Test
    public void formsTest() {
        Document document = new Document("http://justforfun.com");
        List<FormElement> forms = document.forms();
        Assert.assertNotNull(forms);
    }

    @Test
    public void titleLabelTest() {
        Document document = new Document("http://baseuri.com");
        document.title("Page Title");
        Assert.assertEquals("Page Title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://createelement.com");
        Element element = document.createElement("div");
        Assert.assertEquals("<div></div>", element.toString());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://charsettest.com");
        document.charset(StandardCharsets.UTF_8);
        Assert.assertEquals(StandardCharsets.UTF_8, document.charset());
    }

    @Test
    public void outerHtmlTest() {
        Document document = Document.createShell("http://outerhtmltest.com");
        Assert.assertEquals("<html>\n <head></head>\n <body></body>\n</html>", document.outerHtml());
    }

    @Test
    public void textTest() {
        Document document = new Document("http://texttest.com");
        document.text("Doc text");
        Assert.assertEquals("Doc text", document.text());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://updatemetacharset.com");
        document.updateMetaCharsetElement(true);
        Assert.assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void nodeNameTest() {
        Document document = new Document("http://nodenametest.com");
        Assert.assertEquals("#document", document.nodeName());
    }

    @Test
    public void cloneTest() {
        Document original = new Document("http://clonetest.com");
        Document clone = original.clone();
        Assert.assertEquals(original.toString(), clone.toString());
    }

    @Test
    public void shallowCloneTest() {
        Document original = new Document("http://shallowclonetest.com");
        Document clone = original.shallowClone();
        Assert.assertEquals(original.toString(), clone.toString());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://outputsettingstest.com");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://quirksmodetest.com");
        document.quirksMode(Document.QuirksMode.quirks);
        Assert.assertEquals(Document.QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://parsertest.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

}