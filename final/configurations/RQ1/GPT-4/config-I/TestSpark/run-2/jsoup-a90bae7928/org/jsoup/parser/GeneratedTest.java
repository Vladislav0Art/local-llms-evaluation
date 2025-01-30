package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertNotNull(xmlTreeBuilder.newInstance());
        assertNotSame(xmlTreeBuilder, xmlTreeBuilder.newInstance());
    }

    @Test
    public void parseReaderInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse(new StringReader("<sample>example</sample>"), "http://sample.com");
        assertNotNull(doc);
        assertTrue(doc.hasText());
    }

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse("<sample>example</sample>", "http://sample.com");
        assertNotNull(doc);
        assertTrue(doc.hasText());
    }

    @Test
    public void insertStartTagTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "sample";
        Element element = xmlTreeBuilder.insert(startTag);
        assertEquals("sample", element.tagName());
    }

    @Test
    public void parseFragmentTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<sample>example</sample>", "http://sample.com", parser);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
    }

    @Test
    public void processCharacterTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.Character();
        token.asCharacter().data("text");
        boolean result = xmlTreeBuilder.process(token);
        assertTrue(result);
    }

    @Test
    public void processEofTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.EOF();
        boolean result = xmlTreeBuilder.process(token);
        assertTrue(result);
    }

    @Test
    public void parseFragmentTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<sample>example</sample>", "http://sample.com", parser);
        assertEquals(1, nodes.size());
        assertThat(nodes.get(0), instanceOf(Element.class));
    }

    @Test
    public void parseReaderInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse(new StringReader("<sample>example</sample>"), "http://sample.com");
        assertNotNull(doc);
        assertNotNull(doc.text());
    }

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse("<sample>example</sample>", "http://sample.com");
        assertNotNull(doc);
        assertNotNull(doc.text());
    }

    @Test
    public void parseFragmentTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<sample>example</sample>", "http://sample.com", parser);
        assertNotNull(nodes);
        assert (nodes.get(0) instanceof Element);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();
        assertNotNull(newInstance);
        assertNotSame(xmlTreeBuilder, newInstance);
    }

    @Test
    public void parseReaderInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse(new StringReader("<sample>example</sample>"), "http://sample.com");
        assertNotNull(doc);
        assertEquals("example", doc.text());
    }

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse("<sample>example</sample>", "http://sample.com");
        assertNotNull(doc);
        assertEquals("example", doc.text());
    }

}