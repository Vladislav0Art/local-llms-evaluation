package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedTest {

    @Test
    public void parseInputBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<tag>someXml</tag>";
        Document document = xmlTreeBuilder.parse(input, "http://base.uri");
        Assert.assertEquals("someXml", document.text());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("test");
        xmlTreeBuilder.insert(startTag);
        Assert.assertEquals("test", xmlTreeBuilder.currentElement().tagName());
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment comment = new Token.Comment();
        comment.append("comment");
        xmlTreeBuilder.insert(comment);
        Assert.assertEquals("comment", xmlTreeBuilder.currentElement().childNode(0).toString());
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name("p");
        xmlTreeBuilder.insert(startTag);
        Assert.assertEquals("p", xmlTreeBuilder.currentElement().tagName());
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("p");
        xmlTreeBuilder.popStackToClose(endTag);
        Assert.assertNotEquals("p", xmlTreeBuilder.currentElement().tagName());
    }

    @Test
    public void initializeParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader input = new StringReader("<tag>someXml</tag>");
        xmlTreeBuilder.initialiseParse(input, "http://base.uri", Parser.xmlParser());
        Document document = xmlTreeBuilder.doc;
        Assert.assertEquals("http://base.uri", document.baseUri());
    }

    @Test
    public void parseInputBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader input = new StringReader("<tag>someXml</tag>");
        Document document = xmlTreeBuilder.parse(input, "http://base.uri");
        Assert.assertEquals("someXml", document.body().text());
    }

    @Test
    public void parseFragmentInputBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<p>test</p>", "http://base.uri", new Parser(xmlTreeBuilder));
        Assert.assertEquals(1, nodes.size());
        Assert.assertEquals("p", nodes.get(0).nodeName());
        Assert.assertEquals("test", nodes.get(0).childNode(0).toString());
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character character = new Token.Character();
        character.data("Test character");
        xmlTreeBuilder.insert(character);
        Assert.assertEquals("Test character", xmlTreeBuilder.currentElement().childNode(0).toString());
    }

    @Test
    public void parseFragmentInputBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<p>test</p>", "http://base.uri", new Parser(xmlTreeBuilder));
        Assert.assertEquals(1, nodes.size());
        Assert.assertEquals("p", nodes.get(0).nodeName());
        Assert.assertEquals("test", nodes.get(0).childNode(0).outerHtml());
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character character = new Token.Character();
        character.data("Test character");
        xmlTreeBuilder.insert(character);
        Assert.assertEquals("Test character", xmlTreeBuilder.currentElement().childNode(0).outerHtml());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "p";
        xmlTreeBuilder.insert(startTag);
        Assert.assertEquals("p", xmlTreeBuilder.currentElement().tagName());
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "p";
        xmlTreeBuilder.insert(startTag);
        Assert.assertEquals("p", xmlTreeBuilder.currentElement().tagName());
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName = "p";
        xmlTreeBuilder.popStackToClose(endTag);
        Assert.assertEquals("", xmlTreeBuilder.currentElement().tagName());
    }

}