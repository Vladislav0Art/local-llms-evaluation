package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTest {

    private static final String BASE_URI = "https://google.com";

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document(BASE_URI);
        Assert.assertEquals(BASE_URI, document.location());
    }

    @Test
    public void createShellTest() {
        Document shell = Document.createShell(BASE_URI);
        Assert.assertEquals("<html>\n <head></head>\n <body></body>\n</html>", shell.html());
    }

    @Test
    public void titleTest() {
        Document document = Document.createShell(BASE_URI);
        document.title("Google");
        Assert.assertEquals("Google", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document(BASE_URI);
        Element div = document.createElement("div");
        Assert.assertEquals("div", div.tagName());
    }

    @Test
    public void connectionTest() {
        Document document = new Document(BASE_URI);
        Connection connection = document.connection();
        Assert.assertNotNull(connection);
    }

    @Test
    public void charsetTest() {
        Document document = new Document(BASE_URI);
        document.charset(StandardCharsets.UTF_8);
        Assert.assertEquals(StandardCharsets.UTF_8, document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document(BASE_URI);
        document.updateMetaCharsetElement(true);
        Assert.assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document(BASE_URI);
        document.body().appendElement("div").addClass("test");
        Assert.assertEquals("<html>\n <head></head>\n <body>\n  <div class=\"test\"></div>\n </body>\n</html>", document.outerHtml());
    }

    @Test
    public void textTest() {
        Document document = new Document(BASE_URI);
        document.text("This is a test");
        Assert.assertEquals("This is a test", document.body().text());
    }

    @Test
    public void nodeNameTest() {
        Document document = new Document(BASE_URI);
        Assert.assertEquals("#document", document.nodeName());
    }

    @Test
    public void cloneTest() {
        Document document = new Document(BASE_URI);
        Document clone = document.clone();
        Assert.assertNotSame(document, clone);
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document(BASE_URI);
        Document clone = document.shallowClone();
        Assert.assertNotSame(document, clone);
    }

    @Test
    public void htmlElTest() {
        Document document = new Document(BASE_URI);
        Element html = document.htmlEl();
        Assert.assertNotNull(html);
    }

    @Test
    public void headTest() {
        Document document = new Document(BASE_URI);
        Element head = document.head();
        Assert.assertNotNull(head);
    }

    @Test
    public void bodyTest() {
        Document document = new Document(BASE_URI);
        Element body = document.body();
        Assert.assertNotNull(body);
    }

    @Test
    public void formsTest() {
        Document document = new Document(BASE_URI);
        List<FormElement> forms = document.forms();
        Assert.assertNotNull(forms);
    }

    @Test
    public void expectFormTest() {
        Document document = new Document(BASE_URI);
        document.expectForm("div");
    }

    @Test
    public void parserTest() {
        Document document = new Document(BASE_URI);
        Parser parser = document.parser();
        Assert.assertNotNull(parser);
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document(BASE_URI);
        Document.OutputSettings outputSettings = document.outputSettings();
        Assert.assertNotNull(outputSettings);
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document(BASE_URI);
        document.quirksMode(Document.QuirksMode.quirks);
        Assert.assertEquals(Document.QuirksMode.quirks, document.quirksMode());
    }

}