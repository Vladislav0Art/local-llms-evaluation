package org.jsoup.parser;

import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertEquals(ParseSettings.preserveCase, xmlTreeBuilder.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        assertEquals(Document.OutputSettings.Syntax.xml, xmlTreeBuilder.doc.outputSettings().syntax());
        assertEquals(Entities.EscapeMode.xhtml, xmlTreeBuilder.doc.outputSettings().escapeMode());
        assertTrue(xmlTreeBuilder.doc != null);
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse(new StringReader("<root></root>"), "http://example.com");
        assertTrue(doc != null);
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse("<root></root>", "http://example.com");
        assertTrue(doc != null);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();
        assertTrue(newInstance != null);
    }

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = Mockito.mock(Token.class);
        Mockito.when(token.type).thenReturn(Token.TokenType.StartTag);
        assertTrue(xmlTreeBuilder.process(token));
    }

    @Test
    public void processUnexpectedTokenTypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = Mockito.mock(Token.class);
        Mockito.when(token.type).thenReturn(Token.TokenType.EOF);
        xmlTreeBuilder.process(token);
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element el = new Element("root", "http://example.com");
        xmlTreeBuilder.insertNode(el);
        assertEquals(el, xmlTreeBuilder.currentElement().child(0));
    }

    @Test
    public void insertNodeWithTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element el = new Element("root", "http://example.com");
        Token token = Mockito.mock(Token.class);
        xmlTreeBuilder.insertNode(el, token);
        assertEquals(el, xmlTreeBuilder.currentElement().child(0));
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<root></root>", "http://example.com", new Parser(xmlTreeBuilder));
        assertTrue(nodes.size() > 0);
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element("Context", "http://example.com");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<root></root>", context, "http://example.com", new Parser(xmlTreeBuilder));
        assertTrue(nodes.size() > 0);
    }

}