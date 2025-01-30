package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertEquals(ParseSettings.preserveCase, xmlTreeBuilder.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<rootNode/>");
        xmlTreeBuilder.initialiseParse(input, "http://testUri", new Parser(xmlTreeBuilder));
        assertEquals("http://testUri", xmlTreeBuilder.doc.baseUri());
        assertEquals(1, xmlTreeBuilder.stack.size());
    }

    @Test
    public void parseReaderInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<rootNode/>");
        Document xmlDoc = xmlTreeBuilder.parse(input, "http://testUri");
        assertNotNull(xmlDoc);
        assertEquals("<rootnode></rootnode>", xmlDoc.outerHtml());
    }

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<rootNode/>";
        Document xmlDoc = xmlTreeBuilder.parse(input, "http://testUri");
        assertNotNull(xmlDoc);
        assertEquals("<rootnode></rootnode>", xmlDoc.outerHtml());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();
        assertNotNull(newInstance);
        assertTrue(newInstance instanceof XmlTreeBuilder);
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTagToken = new Token.StartTag();
        startTagToken.name("tag");
        xmlTreeBuilder.insert(startTagToken);
        assertEquals(2, xmlTreeBuilder.stack.size());
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insertNode(new TextNode("Test Node"));
        assertTrue(xmlTreeBuilder.currentElement().hasText());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<tag>Test Fragment</tag>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "http://testUri", new Parser(xmlTreeBuilder));
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<tag>Test Fragment</tag>";
        Element contextElement = new Element(Tag.valueOf("div"), "");
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, contextElement, "http://testUri", new Parser(xmlTreeBuilder));
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
    }

    @Test
    public void processInvalidTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.EndTag();
        xmlTreeBuilder.process(token);
    }

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.data("Test Character");
        xmlTreeBuilder.insert(characterToken);
        assertTrue(xmlTreeBuilder.currentElement().hasText());
    }

}