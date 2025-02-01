package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedTest {

    @Test
    public void parseReaderInputBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("<tag>content</tag>"), "http://base.uri");
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<tag>\n content\n</tag>\n", document.toString());
    }

    @Test
    public void parseStringInputBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<tag>content</tag>", "http://base.uri");
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<tag>\n content\n</tag>\n", document.toString());
    }

    @Test
    public void processTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "tag";
        startTag.attributes.put("attribute", "value");
        Assert.assertTrue(xmlTreeBuilder.process(startTag));
    }

    @Test
    public void processTokenInvalidTypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.Character();
        token.type = Token.TokenType.EOF;
        xmlTreeBuilder.process(token);
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.name = "tag";
        startTag.attributes.put("attribute", "value");
        Assert.assertNotNull(xmlTreeBuilder.insert(startTag));
    }

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.setData("This is a comment");
        xmlTreeBuilder.insert(commentToken);
    }

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.setData("This is a character data");
        xmlTreeBuilder.insert(characterToken);
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctype = new Token.Doctype();
        doctype.setName("doctypeName");
        xmlTreeBuilder.insert(doctype);
    }

    @Test
    public void parseFragmentInputFragmentBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodeList = xmlTreeBuilder.parseFragment("<tag>content</tag>", "http://base.uri", Parser.xmlParser());

        Assert.assertNotNull(nodeList);
        Assert.assertEquals(1, nodeList.size());
        Assert.assertTrue(nodeList.get(0) instanceof Element);
        Assert.assertEquals("<tag>content</tag>", nodeList.get(0).outerHtml());
    }

    @Test
    public void parseFragmentInputFragmentContextBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("context"), "");
        List<Node> nodeList = xmlTreeBuilder.parseFragment("<tag>content</tag>", context, "http://base.uri", Parser.xmlParser());

        Assert.assertNotNull(nodeList);
        Assert.assertEquals(1, nodeList.size());
        Assert.assertTrue(nodeList.get(0) instanceof Element);
        Assert.assertEquals("<tag>content</tag>", nodeList.get(0).outerHtml());
    }

}