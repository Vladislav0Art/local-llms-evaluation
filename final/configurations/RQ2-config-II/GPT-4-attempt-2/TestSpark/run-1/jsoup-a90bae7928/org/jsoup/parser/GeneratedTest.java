package org.jsoup.parser;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        ParseSettings settings = xmlTreeBuilder.defaultSettings();
        assertNotNull(settings);
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<test></test>"), "http://test.com", Parser.xmlParser());
        assertEquals("http://test.com", xmlTreeBuilder.getBaseUri());
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("<test></test>"), "http://test.com");
        assertNotNull(document);
        assertEquals("<test></test>", document.toString());
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<test></test>", "http://test.com");
        assertNotNull(document);
        assertEquals("<test></test>", document.toString());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        TreeBuilder newInstance = xmlTreeBuilder.newInstance();
        assertNotNull(newInstance);
        assertTrue(newInstance instanceof XmlTreeBuilder);
    }

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        boolean result = xmlTreeBuilder.process(new Token.StartTag("test"));
        assertTrue(result);
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insertNode(new TextNode("test", "http://test.com"));
        assertTrue(xmlTreeBuilder.getStack().size() > 0);
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element element = xmlTreeBuilder.insert(new Token.StartTag("test"));
        assertNotNull(element);
        assertEquals("<test></test>", element.toString());
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Comment("test"));
        assertTrue(xmlTreeBuilder.getStack().size() > 0);
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Character("test"));
        assertTrue(xmlTreeBuilder.getStack().size() > 0);
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Doctype("test"));
        assertTrue(xmlTreeBuilder.getStack().size() > 0);
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.StartTag("test"));
        xmlTreeBuilder.popStackToClose(new Token.EndTag("test"));
        assertTrue(xmlTreeBuilder.getStack().isEmpty());
    }

    @Test
    public void parseFragmentWithoutContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<test></test>", "http://test.com", Parser.xmlParser());
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
        assertEquals("<test></test>", nodes.get(0).toString());
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("div"), "http://test.com");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<test></test>", context, "http://test.com", Parser.xmlParser());
        assertNotNull(nodes);
        assertTrue(nodes.size() > 0);
        assertEquals("<test></test>", nodes.get(0).toString());
    }

}