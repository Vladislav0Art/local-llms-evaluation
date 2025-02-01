package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        ParseSettings defaultSettings = xmlTreeBuilder.defaultSettings();
        assertSame(ParseSettings.preserveCase, defaultSettings);
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        Document.OutputSettings outputSettings = xmlTreeBuilder.getSettings().outputSettings();
        assertEquals(Document.OutputSettings.Syntax.xml, outputSettings.syntax());
        assertEquals(Entities.EscapeMode.xhtml, outputSettings.escapeMode());
        assertFalse(outputSettings.prettyPrint());
    }

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse(new StringReader("<root></root>"), "http://example.com");
        assertEquals("<root></root>", doc.toString());
    }

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse("<root></root>", "http://example.com");
        assertEquals("<root></root>", doc.toString());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder instance = xmlTreeBuilder.newInstance();
        assertNotNull(instance);
    }

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        boolean result = xmlTreeBuilder.process(new Token.StartTag("root"));
        assertTrue(result);
    }

    @Test
    public void processUnknownTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token()); // using Token constructor directly to generate unknown token type
    }

    @Test
    public void insertNodeNoTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.insertNode(new Comment("Comment"));
        assertEquals("<root></root>", xmlTreeBuilder.getSettings().toString());
    }

    @Test
    public void insertNodeWithTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.insertNode(new Comment("Comment"), new Token.Comment());
        assertEquals("<root></root>", xmlTreeBuilder.getSettings().toString());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        Token.StartTag startTag = new Token.StartTag("root");
        startTag.attributes.add("attr", "value");
        xmlTreeBuilder.insert(startTag);
        assertEquals("<root></root>", xmlTreeBuilder.getSettings().toString());
    }

    @Test
    public void parseFragmentStringBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<root><child/></root>", "http://example.com", new Parser(xmlTreeBuilder));
        assertEquals(1, nodes.size()); // root node
        assertEquals("root", nodes.get(0).nodeName());
    }

    @Test
    public void parseFragmentStringElementBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("root"), "");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<child/>", context, "http://example.com", new Parser(xmlTreeBuilder));
        assertEquals(1, nodes.size()); // root node
        assertEquals("root", nodes.get(0).nodeName());
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root><child1><child2/></child1><child3/></root>"), "http://example.com", new Parser(xmlTreeBuilder));
        xmlTreeBuilder.runParser();
        xmlTreeBuilder.popStackToClose(new Token.EndTag("child1"));
        assertEquals("<root><child1></child1><child3></child3></root>", xmlTreeBuilder.getSettings().toString());
    }

}