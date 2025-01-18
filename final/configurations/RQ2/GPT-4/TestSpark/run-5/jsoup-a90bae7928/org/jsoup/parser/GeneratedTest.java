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
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertNotNull(builder.defaultSettings());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        XmlTreeBuilder instance = builder.newInstance();
        assertNotNull(instance);
        assertNotSame(builder, instance);
    }

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root>", "http://test/");
        assertNotNull(doc);
        assertEquals(1, doc.childNodeSize());
        assertEquals("root", doc.childNode(0).nodeName());
    }

    @Test
    public void parseReaderBaseUriTest() {
        StringReader reader = new StringReader("<root>");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse(reader, "http://test/");
        assertNotNull(doc);
        assertEquals(1, doc.childNodeSize());
        assertEquals("root", doc.childNode(0).nodeName());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Parser parser = Parser.xmlParser();
        List<Node> nodes = builder.parseFragment("<test></test>", "http://test.com", parser);
        assertFalse(nodes.isEmpty());
        assertEquals(nodes.get(0).nodeName(), "test");
    }

}