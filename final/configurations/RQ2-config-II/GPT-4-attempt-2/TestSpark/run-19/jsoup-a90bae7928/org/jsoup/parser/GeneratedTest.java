package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertNotNull(xmlTreeBuilder.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<div></div>"), "", Mockito.mock(Parser.class));
        Assert.assertNotNull(xmlTreeBuilder);
    }

    @Test
    public void parseWithReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("<a></a>"), "");
        Assert.assertNotNull(document);
    }

    @Test
    public void parseWithInputStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<span></span>", "");
        Assert.assertNotNull(document);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertNotNull(xmlTreeBuilder.newInstance());
    }

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertTrue(xmlTreeBuilder.process(Mockito.mock(Token.class)));
    }

    @Test
    public void insertNodeTest() {
        Node mockNode = Mockito.mock(Node.class);
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insertNode(mockNode);
        Assert.assertNotNull(xmlTreeBuilder);
    }

    @Test
    public void insertStartTagTest() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "p";
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element element = xmlTreeBuilder.insert(startTag);
        Assert.assertEquals("p", element.tagName());
    }

    @Test
    public void insertCommentTest() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("Meta");
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(commentToken);
        Assert.assertNotNull(xmlTreeBuilder);
    }

    @Test
    public void insertCharacterTest() {
        Token.Character characterToken = new Token.Character();
        characterToken.appendData("CharData");
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(characterToken);
        Assert.assertNotNull(xmlTreeBuilder);
    }

    @Test
    public void insertDoctypeTest() {
        Token.Doctype d = new Token.Doctype();
        d.appendData("DocType");
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(d);
        Assert.assertNotNull(xmlTreeBuilder);
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodeList = xmlTreeBuilder.parseFragment("<p></p>", "", Mockito.mock(Parser.class));
        Assert.assertNotNull(nodeList);
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element("div");
        List<Node> nodeList = xmlTreeBuilder.parseFragment("<a></a>", context, "", Mockito.mock(Parser.class));
        Assert.assertNotNull(nodeList);
    }

}