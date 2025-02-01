package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertNotNull(xmlTreeBuilder.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<test></test>"), "", null);
        assertNotNull(xmlTreeBuilder);
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("<test></test>"), "");
        assertEquals("test", document.select("test").first().nodeName());
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<test></test>", "");
        assertEquals("test", document.select("test").first().nodeName());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.newInstance() instanceof XmlTreeBuilder);
    }

    @Test
    public void processStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.StartTag("test").selfClosing());
        assertEquals(1, xmlTreeBuilder.stack.size());
    }

    @Test
    public void processEndTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.StartTag("test"));
        xmlTreeBuilder.process(new Token.EndTag("test"));
        assertTrue(xmlTreeBuilder.stack.isEmpty());
    }

    @Test
    public void processUnexpectedTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.EOF());
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.StartTag("test"));
        xmlTreeBuilder.insertNode(new TextNode("Test"));
        assertEquals("Test", xmlTreeBuilder.stack.peek().childNode(0).outerHtml());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element testElement = xmlTreeBuilder.insert(new Token.StartTag("test"));
        assertEquals("test", testElement.nodeName());
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.Comment("?xml version=\"1.0\" encoding=\"UTF-8\" ?"));
        assertEquals("<?xml version=\"1.0\" encoding=\"utf-8\" ?>", xmlTreeBuilder.doc.childNode(0).outerHtml());
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.Character("Test"));
        assertEquals("Test", xmlTreeBuilder.doc.childNode(0).outerHtml());
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.Doctype("html"));
        assertTrue(xmlTreeBuilder.doc.childNode(0) instanceof DocumentType);
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.StartTag("test"));
        xmlTreeBuilder.process(new Token.EndTag("test"));
        assertTrue(xmlTreeBuilder.stack.isEmpty());
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertEquals(1, xmlTreeBuilder.parseFragment("<test></test>", new Element("test"), "", null).size());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertEquals(1, xmlTreeBuilder.parseFragment("<test></test>", "", null).size());
    }

}