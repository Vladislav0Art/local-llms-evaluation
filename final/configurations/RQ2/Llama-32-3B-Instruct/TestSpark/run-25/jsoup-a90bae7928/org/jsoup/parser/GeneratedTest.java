package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

import javax.annotation.ParametersAreNonnullByDefault;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void initialiseParse_WithValidInput_andBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader reader = new StringReader("<root><child/></root>");
        builder.initialiseParse(reader, "https://example.com", null);
        assertNotNull(builder.parser());
    }

    @Test
    public void initialiseParse_WithInvalidInput_andBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader reader = new StringReader("<invalidXml></invalidXml>");
        try {
            builder.initialiseParse(reader, "https://example.com", null);
            fail("Expected exception");
        } catch (Exception e) {
            assertTrue(Validate.isInvalidInput(e.getMessage()));
        }
    }

    @Test
    public void parse_WithValidInput_andBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader reader = new StringReader("<root><child></child></root>");
        List<Node> nodes = builder.parseFragment(reader.toString(), "https://example.com", null);
        assertEquals(1, nodes.size());
    }

    @Test
    public void parse_WithInvalidInput_andBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader reader = new StringReader("<invalidXml></invalidXml>");
        List<Node> nodes = builder.parseFragment(reader.toString(), "https://example.com", null);
        assertEquals(0, nodes.size());
    }

    @Test
    public void insertNode_NullNode() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Node node = null;
        builder.insertNode(node);
        assertNull(builder.root());
    }

    @Test
    public void insertNode_ValidInput() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = new Element("child");
        builder.insertNode(element);
        assertEquals(1, builder.children().size());
    }

    @Test
    public void popStackToClose_EndTag_WithValidInput() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token(Token.EndTag, "</child>");
        builder.popStackToClose(token);
        assertEquals(0, builder.stackSize());
    }

    @Test
    public void parseFragment_ValidInput_andBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader reader = new StringReader("<root><child></child></root>");
        List<Node> nodes = builder.parseFragment(reader.toString(), "https://example.com", null);
        assertEquals(1, nodes.size());
    }

    @Test
    public void parseFragment_NullContext() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader reader = new StringReader("<root><child></child></root>");
        List<Node> nodes = builder.parseFragment(reader.toString(), null, "https://example.com", null);
        assertEquals(0, nodes.size());
    }

    @Test
    public void parseFragment_ValidInput_andContext() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = new Element("child");
        Reader reader = new StringReader("<root><child></child></root>");
        List<Node> nodes = builder.parseFragment(reader.toString(), element, "https://example.com", null);
        assertEquals(1, nodes.size());
    }

}