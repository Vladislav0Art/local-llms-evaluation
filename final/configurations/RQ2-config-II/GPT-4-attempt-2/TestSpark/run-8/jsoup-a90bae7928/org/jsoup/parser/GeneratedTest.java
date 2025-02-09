package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(builder));
        Assert.assertEquals(1, builder.stack.size());
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader("<root></root>"), "http://example.com");
        Assert.assertEquals("root", document.childNode(0).nodeName());
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse("<root></root>", "http://example.com");
        Assert.assertEquals("root", document.childNode(0).nodeName());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Assert.assertNotNull(builder.newInstance());
    }

    @Test
    public void processTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Assert.assertTrue(builder.process(new Token.StartTag()));
        Assert.assertTrue(builder.process(new Token.Character("a")));
        Assert.assertTrue(builder.process(new Token.Comment()));
        Assert.assertTrue(builder.process(new Token.Doctype()));
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insertNode(new TextNode("Test"));
        Assert.assertEquals(1, builder.stack.size());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = builder.insert(new Token.StartTag("div"));
        Assert.assertEquals("div", element.tagName());
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Comment("Test comment"));
        Assert.assertEquals("Test comment", builder.stack.get(0).childNode(0).outerHtml());
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Character("Test"));
        Assert.assertEquals("Test", ((TextNode) builder.stack.get(0).childNode(0)).getWholeText());
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Doctype());
        Assert.assertTrue(builder.stack.get(0).childNode(0) instanceof DocumentType);
    }

    @Test
    public void popStackToCloseOperationTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.StartTag("div"));
        builder.insert(new Token.StartTag("p"));
        builder.popStackToClose(new Token.EndTag("p"));
        Assert.assertEquals(1, builder.stack.size());
    }

    @Test
    public void parseFragmentWithoutContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<p>Test</p>", "http://example.com", new Parser(builder));
        Assert.assertEquals(1, nodes.size());
        Assert.assertEquals("p", nodes.get(0).nodeName());
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<span>Test</span>", new Element("div"), "http://example.com", new Parser(builder));
        Assert.assertEquals(1, nodes.size());
        Assert.assertEquals("span", nodes.get(0).nodeName());
    }

}