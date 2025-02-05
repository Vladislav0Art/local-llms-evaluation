package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        ParseSettings settings = treeBuilder.defaultSettings();
        assertNotNull(settings);
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        treeBuilder.initialiseParse(new StringReader("<html></html>"), "http://example.com", new Parser(treeBuilder));
        assertNotNull(treeBuilder.getStack());
    }

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse(new StringReader("<html></html>"), "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void parseInputBaseUriTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Document doc = treeBuilder.parse("<html></html>", "http://example.com");
        assertNotNull(doc);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        TreeBuilder newInstance = treeBuilder.newInstance();
        assertTrue(newInstance instanceof XmlTreeBuilder);
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        TextNode textNode = new TextNode("test", "http://example.com");
        treeBuilder.insertNode(textNode);
        assertTrue(treeBuilder.getStack().contains(textNode));
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName("html");
        Element element = treeBuilder.insert(startTag);
        assertNotNull(element);
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.setData("test");
        treeBuilder.insert(commentToken);
        assertTrue(treeBuilder.getStack().peek() instanceof Comment);
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.setData("a");
        treeBuilder.insert(characterToken);
        assertTrue(treeBuilder.getStack().peek() instanceof TextNode);
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.setName("html");
        treeBuilder.insert(doctypeToken);
        assertTrue(treeBuilder.getStack().peek() instanceof DocumentType);
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName("html");
        treeBuilder.insert(startTag);
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName("html");
        treeBuilder.popStackToClose(endTag);
        assertFalse(treeBuilder.getStack().contains(startTag));
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String inputFragment = "<div></div>";
        List<Node> nodes = treeBuilder.parseFragment(inputFragment, "http://example.com", new Parser(treeBuilder));
        assertEquals(1, nodes.size());
    }

}