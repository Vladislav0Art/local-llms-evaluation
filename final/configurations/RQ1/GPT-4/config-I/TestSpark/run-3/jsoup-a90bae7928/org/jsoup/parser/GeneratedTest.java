package org.jsoup.parser;

import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
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
        xmlTreeBuilder.initialiseParse(new StringReader("<tag>"), "http://baseUri.com", new Parser(xmlTreeBuilder));
    }

    @Test
    public void parseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertNotNull(xmlTreeBuilder.parse(new StringReader("<tag>"), "http://baseUri.com"));
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder1 = new XmlTreeBuilder();
        XmlTreeBuilder xmlTreeBuilder2 = xmlTreeBuilder1.newInstance();
        assertNotNull(xmlTreeBuilder2);
    }

    @Test
    public void processStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.process(new Token.StartTag()));
    }

    @Test
    public void processEndTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.process(new Token.EndTag()));
    }

    @Test
    public void processCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.process(new Token.Comment()));
    }

    @Test
    public void processCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.process(new Token.Character()));
    }

    @Test
    public void processDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.process(new Token.Doctype()));
    }

    @Test
    public void processEOFTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.process(new Token.EOF()));
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<tag></tag>", "http://baseUri.com", new Parser(xmlTreeBuilder));
        assertNotNull(nodes);
        assertTrue(!nodes.isEmpty());
        assertEquals("tag", nodes.get(0).nodeName());
    }

}