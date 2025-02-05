package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Assert.assertNotNull(builder.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader input = new StringReader("<test></test>");
        builder.initialiseParse(input, "http://base.uri", new Parser(builder));
    }

    @Test
    public void parseReaderInputTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader input = new StringReader("<test></test>");
        Document document = builder.parse(input, "http://base.uri");
        Assert.assertEquals("http://base.uri", document.baseUri());
    }

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse("<test></test>", "http://base.uri");
        Assert.assertEquals("http://base.uri", document.baseUri());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Assert.assertNotNull(builder.newInstance());
    }

    @Test
    public void processTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token.Character();
        token.data("test");
        Assert.assertTrue(builder.process(token));
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element node = new Element("test");
        builder.insertNode(node);
        Assert.assertTrue(builder.getStack().contains(node));
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.StartTag token = new Token.StartTag();
        token.tagName("test");
        Element element = builder.insert(token);
        Assert.assertEquals("test", element.tagName());
    }

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Comment token = new Token.Comment();
        token.data("test");
        builder.insert(token);
    }

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Character token = new Token.Character();
        token.data("test");
        builder.insert(token);
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Doctype token = new Token.Doctype();
        token.name("test");
        builder.insert(token);
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<test><inner>text</inner></test>", "http://base.uri", new Parser(builder));
        Assert.assertEquals(1, nodes.size());
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element context = new Element("context");
        List<Node> nodes = builder.parseFragment("<test><inner>text</inner></test>", context, "http://base.uri", new Parser(builder));
        Assert.assertEquals(1, nodes.size());
    }

}