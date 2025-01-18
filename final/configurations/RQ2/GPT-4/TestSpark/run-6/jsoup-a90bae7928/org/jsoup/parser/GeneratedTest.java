package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        ParseSettings parseSettings = xmlTreeBuilder.defaultSettings();
        assertTrue(parseSettings instanceof ParseSettings);
    }

    @Test
    public void parseWithReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root></root>");
        String baseUri = "dummyUri";
        Document document = xmlTreeBuilder.parse(reader, baseUri);
        assertNotNull(document);
        assertEquals("root", document.body().tagName());
    }

    @Test
    public void parseWithStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<root></root>";
        String baseUri = "dummyUri";
        Document document = xmlTreeBuilder.parse(input, baseUri);
        assertNotNull(document);
        assertEquals("root", document.body().tagName());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();
        assertNotNull(newInstance);
        assertTrue(newInstance instanceof XmlTreeBuilder);
    }

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character character = new Token.Character().data("<root></root>");
        boolean processed = xmlTreeBuilder.process(character);
        assertTrue(processed);
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<root></root>";
        String baseUri = "dummyUri";
        Parser parser = Parser.xmlParser();
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, baseUri, parser);
        assertFalse(nodes.isEmpty());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("root", ((Element) nodes.get(0)).tagName());
    }

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertNotNull(xmlTreeBuilder.defaultSettings());
    }

    @Test
    public void parseWithReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root></root>");
        String baseUri = "dummyUri";
        Document document = xmlTreeBuilder.parse(reader, baseUri);
        assertNotNull(document);
        assertEquals("root", document.child(0).tagName());
    }

    @Test
    public void parseWithStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<root></root>";
        String baseUri = "dummyUri";
        Document document = xmlTreeBuilder.parse(input, baseUri);
        assertNotNull(document);
        assertEquals("root", document.child(0).tagName());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();
        assertNotNull(newInstance);
        assertTrue(newInstance instanceof XmlTreeBuilder);
    }

    private void processTokenTest(Token token) {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        boolean processed = xmlTreeBuilder.process(token);
        assertTrue(processed);
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<root><child></child></root>";
        String baseUri = "dummyUri";
        Parser parser = Parser.xmlParser();
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, baseUri, parser);
        assertFalse(nodes.isEmpty());
        assertEquals("root", nodes.get(0).nodeName());
    }

    @Test
    public void processTokenCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character character = new Token.Character().data("dummyData");
        boolean processed = xmlTreeBuilder.process(character);
        assertTrue(processed);
    }

    @Test
    public void processTokenStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("root", new Attributes());
        boolean processed = xmlTreeBuilder.process(startTag);
        assertTrue(processed);
    }

    @Test
    public void processTokenEndTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("root");
        boolean processed = xmlTreeBuilder.process(endTag);
        assertTrue(processed);
    }

}