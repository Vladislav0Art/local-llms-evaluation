package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Parser;
import org.jsoup.parser.ParseSettings;
import org.jsoup.nodes.Node;

public class GeneratedTest {

    @Test
    public void parseStartTagTests() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<tag>content</tag>";
        List<Node> result = builder.parse(input, null);
        assertEquals(1, result.size());
        Element element = (Element) result.get(0);
        assertNotNull(element);
        assertEquals("tag", element.tagName());
    }

    @Test
    public void parseStartTagWithAttributesTests() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<tag attr='value'>content</tag>";
        List<Node> result = builder.parse(input, null);
        Element element = (Element) result.get(0);
        assertNotNull(element);
        assertEquals("tag", element.tagName());
        assertEquals("value", element.getAttribute("attr"));
    }

    @Test
    public void parseEndTagTests() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "</tag>";
        List<Node> result = builder.parse(input, null);
        assertEquals(0, result.size());
    }

    @Test
    public void processStartTagTests() {
        Token token = new Token.StartTag("tag", null, null, 10, null);
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertTrue(builder.process(token));
    }

    @Test
    public void processEndTagTests() {
        Token token = new Token.EndTag("tag");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertTrue(builder.process(token));
    }

    @Test
    public void insertCommentTests() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<!-- comment -->";
        List<Node> result = builder.parse(input, null);
        Comment comment = (Comment) result.get(0);
        assertNotNull(comment);
    }

    @Test
    public void insertCharacterTests() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token.Character("data", true, 10, null);
        assertTrue(builder.process(token));
    }

    @Test
    public void insertDoctypeTests() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<!DOCTYPE doc>";
        List<Node> result = builder.parse(input, null);
        DocumentType doctype = (DocumentType) result.get(0);
        assertNotNull(doctype);
    }

    @Test
    public void runParserTests() {
        Parser parser = new Parser();
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<tag>content</tag>";
        List<Node> result = builder.parse(input, null);
        builder.initialiseParse(new StringReader(input), null, parser);
        assertEquals(1, result.size());
    }

    @Test
    public void parseFragmentTests() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String input = "<tag>content</tag>";
        List<Node> result = builder.parseFragment(input, null, new Parser());
        assertEquals(1, result.size());
    }

}