package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://base.uri", Parser.xmlParser());
        assertNotNull(xmlTreeBuilder.stack);
    }

    @Test
    public void parseReaderBaseUriTest() {
        Document parsedDocument = new XmlTreeBuilder().parse(new StringReader("<root></root>"), "http://base.uri");
        assertNotNull(parsedDocument);
        assertEquals("http://base.uri", parsedDocument.baseUri());
    }

    @Test
    public void parseStringBaseUriTest() {
        Document parsedDocument = new XmlTreeBuilder().parse("<root></root>", "http://base.uri");
        assertNotNull(parsedDocument);
        assertEquals("http://base.uri", parsedDocument.baseUri());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder instance = new XmlTreeBuilder().newInstance();
        assertNotNull(instance);
        assertTrue(instance instanceof XmlTreeBuilder);
    }

    @Test
    public void processTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://base.uri", Parser.xmlParser());
        Token token = new Token.StartTag();
        assertTrue(xmlTreeBuilder.process(token));
    }

    @Test
    public void insertTokenStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://base.uri", Parser.xmlParser());
        Token.StartTag startTag = new Token.StartTag();
        xmlTreeBuilder.insert(startTag);
        assertNotNull(xmlTreeBuilder.stack.get(0));
    }

    @Test
    public void insertTokenCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://base.uri", Parser.xmlParser());
        Token.Character characterToken = new Token.Character();
        xmlTreeBuilder.insert(characterToken);
        assertNotNull(xmlTreeBuilder.stack.get(0));
    }

    @Test
    public void parseFragmentInputFragmentBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<element>content</element>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "http://base.uri", Parser.xmlParser());
        assertNotNull(nodes);
    }

    @Test
    public void parseFragmentInputFragmentContextBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<child>content</child>";
        Element context = new Element(Tag.valueOf("parent"), "");
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, context, "http://base.uri", Parser.xmlParser());
        assertNotNull(nodes);
    }

}