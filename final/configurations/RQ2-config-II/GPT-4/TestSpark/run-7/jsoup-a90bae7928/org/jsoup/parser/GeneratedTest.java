package org.jsoup.parser;

import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
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
        Parser parser = Mockito.mock(Parser.class);
        xmlTreeBuilder.initialiseParse(new StringReader("<test>"), "http://localhost", parser);
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertNotNull(xmlTreeBuilder.parse(new StringReader("<test>"), "http://localhost"));
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertNotNull(xmlTreeBuilder.parse("<test>", "http://localhost"));
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertNotNull(xmlTreeBuilder.newInstance());
    }

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = Mockito.mock(Token.class);
        Assert.assertTrue(xmlTreeBuilder.process(token));
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element element = Mockito.mock(Element.class);
        xmlTreeBuilder.insertNode(element);
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag tag = new Token.StartTag();
        Assert.assertNotNull(xmlTreeBuilder.insert(tag));
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        xmlTreeBuilder.insert(commentToken);
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        xmlTreeBuilder.insert(characterToken);
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        xmlTreeBuilder.insert(doctypeToken);
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag();
        xmlTreeBuilder.popStackToClose(endTag);
    }

    @Test
    public void parseFragmentWithParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser parser = Mockito.mock(Parser.class);
        List<Node> nodes = xmlTreeBuilder.parseFragment("<test>", "http://localhost", parser);
        Assert.assertNotNull(nodes);
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Parser parser = Mockito.mock(Parser.class);
        Element context = Mockito.mock(Element.class);
        List<Node> nodes = xmlTreeBuilder.parseFragment("<test>", context, "http://localhost", parser);
        Assert.assertNotNull(nodes);
    }

}