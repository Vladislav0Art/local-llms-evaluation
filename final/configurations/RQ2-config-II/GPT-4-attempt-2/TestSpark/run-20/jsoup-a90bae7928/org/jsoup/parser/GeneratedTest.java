package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

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
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "http://example.com", Parser.xmlParser());
        assertTrue(xmlTreeBuilder.sourceNormalised);
    }

    @Test
    public void parseReaderInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("<root></root>"), "http://example.com");
        assertNotNull(document);
        assertEquals("root", document.childNode(0).nodeName());
    }

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<root></root>", "http://example.com");
        assertNotNull(document);
        assertEquals("root", document.childNode(0).nodeName());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.newInstance() instanceof XmlTreeBuilder);
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Node node = new Element("root");
        xmlTreeBuilder.insertNode(node);
        assertTrue(xmlTreeBuilder.nodes.contains(node));
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<element>Content</element>", "http://example.com", Parser.xmlParser());
        assertNotNull(nodes);
        assertEquals("element", nodes.get(0).nodeName());
        assertEquals("Content", nodes.get(0).childNode(0).toString());
    }

}