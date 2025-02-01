package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.Entities.EscapeMode;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://example.com");
        Assert.assertNotNull(doc);
        Assert.assertEquals("http://example.com", doc.location());
    }

    @Test
    public void locationTest() {
        Document doc = new Document("http://example.com");
        Assert.assertEquals("http://example.com", doc.location());
    }

    @Test
    public void connectionTest() {
        Document doc = new Document("http://example.com");
        Connection connection = doc.connection();
        Assert.assertNotNull(connection);
    }

    @Test
    public void titleTest() {
        Document doc = Jsoup.parse("<title>Hello World</title>");
        String title = doc.title();
        Assert.assertEquals("Hello World", title);
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        Element elem = doc.createElement("span");
        Assert.assertEquals("<span></span>", elem.outerHtml());
    }

    @Test
    public void textTest() {
        Document doc = new Document("http://example.com");
        doc.text("Hello World");
        Assert.assertEquals("Hello World", doc.text());
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com");
        doc.charset(StandardCharsets.UTF_8);
        Assert.assertEquals(StandardCharsets.UTF_8, doc.charset());
    }

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("http://example.com");
        doc.outputSettings().syntax(Syntax.xml);
        Assert.assertEquals(Syntax.xml, doc.outputSettings().syntax());
    }

    @Test
    public void formsTest() {
        Document doc = Jsoup.parse("<form id='loginForm'><input name='username' value='myUsername' /></form>");
        List<FormElement> forms = doc.forms();
        Assert.assertEquals(1, forms.size());
        Assert.assertEquals("loginForm", forms.get(0).id());
    }

    @Test
    public void expectFormTest() {
        Document doc = Jsoup.parse("<form id='loginForm'><input name='username' value='myUsername' /></form>");
        FormElement form = doc.expectForm("#loginForm");
        Assert.assertEquals("loginForm", form.id());
    }

    @Test
    public void expectFormTest_NoFormMatched() {
        Document doc = Jsoup.parse("<form id='loginForm'><input name='username' value='myUsername' /></form>");
        doc.expectForm("#nonExistentForm");
    }

    @Test
    public void parserTest() {
        Document doc = new Document("http://example.com");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);
        Assert.assertEquals(parser, doc.parser());
    }

}