package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new StringReader("<root/>"), "http://base.uri", new Parser(builder));
        Document doc = builder.parse(new StringReader("<root/>"), "http://base.uri");
        assertEquals("http://base.uri", doc.baseUri());
    }

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse(new StringReader("<root/>"), "http://base.uri");
        assertNotNull(doc);
        assertEquals("root", doc.childNode(0).nodeName());
    }

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root/>", "http://base.uri");
        assertNotNull(doc);
        assertEquals("root", doc.childNode(0).nodeName());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        TreeBuilder newBuilder = builder.newInstance();
        assertNotNull(newBuilder);
        assertTrue(newBuilder instanceof XmlTreeBuilder);
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<root/>", "http://base.uri", new Parser(builder));
        assertNotNull(nodes);
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("root", nodes.get(0).nodeName());
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("root"), "http://base.uri");
        List<Node> nodes = builder.parseFragment("<child/>", context, "http://base.uri", new Parser(builder));
        assertNotNull(nodes);
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("child", nodes.get(0).nodeName());
        assertEquals("root", ((Element) nodes.get(0)).parent().nodeName());
    }

}