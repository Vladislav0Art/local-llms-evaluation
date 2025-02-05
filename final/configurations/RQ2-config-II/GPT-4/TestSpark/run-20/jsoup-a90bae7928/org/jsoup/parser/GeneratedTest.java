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
        XmlTreeBuilder builder = new XmlTreeBuilder();
        ParseSettings settings = builder.defaultSettings();
        assertNotNull(settings);
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new StringReader("<root/>"), "http://example.com", Parser.xmlParser());
    }

    @Test
    public void parseReaderInputTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse(new StringReader("<root/>"), "http://example.com");
        assertEquals("root", doc.childNode(0).nodeName());
    }

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<root/>", "http://example.com");
        assertEquals("root", doc.childNode(0).nodeName());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        TreeBuilder newBuilder = builder.newInstance();
        assertNotSame(builder, newBuilder);
    }

    @Test
    public void processTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new StringReader("<root/>"), "http://example.com", Parser.xmlParser());
        boolean result = builder.process(new Token.StartTag().name("root"));
        assertTrue(result);
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element node = new Element(Tag.valueOf("root"), "");
        builder.insertNode(node);
        assertEquals("root", builder.stack.peek().nodeName());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.StartTag().name("root"));
        assertEquals("root", builder.stack.peek().nodeName());
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Comment());
        assertTrue(builder.stack.peek() instanceof Comment);
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Character().data("data"));
        assertTrue(builder.stack.peek() instanceof TextNode);
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(new Token.Doctype());
        assertTrue(builder.stack.peek() instanceof DocumentType);
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag().name("root");
        builder.insert(startTag);
        builder.popStackToClose(new Token.EndTag().name("root"));
        assertTrue(builder.stack.isEmpty());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<root><child/></root>";
        List<Node> nodes = builder.parseFragment(input, "http://example.com", Parser.xmlParser());
        assertEquals(1, nodes.size());
    }

}