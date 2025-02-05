package org.jsoup.parser;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Token;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertNotNull(xmlTreeBuilder.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<tag></tag>");
        xmlTreeBuilder.initialiseParse(reader, "www.example.com", new Parser(xmlTreeBuilder));
    }

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<tag></tag>");
        Document document = xmlTreeBuilder.parse(reader, "www.example.com");
        assertNotNull(document);
    }

    @Test
    public void parseInputBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<tag></tag>", "www.example.com");
        assertNotNull(document);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertNotNull(xmlTreeBuilder.newInstance());
    }

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = mock(Token.class);
        assertTrue(xmlTreeBuilder.process(token));
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insertNode(new Element("test"));
    }

    @Test
    public void insertTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = mock(Token.StartTag.class);
        assertNotNull(xmlTreeBuilder.insert((Token.StartTag) token));
    }

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment token = mock(Token.Comment.class);
        xmlTreeBuilder.insert(token);
    }

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character token = mock(Token.Character.class);
        xmlTreeBuilder.insert(token);
    }

    @Test
    public void insertDoctypeTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype token = mock(Token.Doctype.class);
        xmlTreeBuilder.insert(token);
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag token = mock(Token.EndTag.class);
        xmlTreeBuilder.popStackToClose(token);
    }

    @Test
    public void parseFragmentWithBaseUriAndParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> fragment = xmlTreeBuilder.parseFragment("<tag></tag>", "www.example.com", new Parser(xmlTreeBuilder));
        assertNotNull(fragment);
        assertFalse(fragment.isEmpty());
    }

    @Test
    public void parseFragmentWithContextBaseUriAndParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element("context");
        List<Node> fragment = xmlTreeBuilder.parseFragment("<tag></tag>", context, "www.example.com", new Parser(xmlTreeBuilder));
        assertNotNull(fragment);
        assertFalse(fragment.isEmpty());
    }

}