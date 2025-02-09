package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.mockito.Mockito;

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
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com/";
        Parser parser = Parser.xmlParser();
        builder.initialiseParse(reader, baseUri, parser);
        assertNotNull(builder);
    }

    @Test
    public void parseWithReaderTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com/";
        Document document = builder.parse(reader, baseUri);
        assertNotNull(document);
    }

    @Test
    public void parseWithStringTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String xml = "<root><child/></root>";
        String baseUri = "http://example.com/";
        Document document = builder.parse(xml, baseUri);
        assertNotNull(document);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        XmlTreeBuilder newBuilder = builder.newInstance();
        assertNotNull(newBuilder);
    }

    @Test
    public void processTest() {
        Token token = Mockito.mock(Token.class);
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertTrue(builder.process(token));
    }

    @Test
    public void insertNodeTest() {
        TextNode node = new TextNode("test");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insertNode(node);
        assertNotNull(builder);
    }

    @Test
    public void insertStartTagTest() {
        Token.StartTag startTag = new Token.StartTag();
        startTag.tagName = "test";

        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element element = builder.insert(startTag);

        assertNotNull(element);
        // evaluates that the inserted tag is present in the document
        assertEquals("test", element.tagName());
    }

    @Test
    public void insertCommentTest() {
        Token.Comment commentToken = new Token.Comment();
        commentToken.getData().append("test comment");

        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(commentToken);
        assertNotNull(builder);
    }

    @Test
    public void insertCharacterTest() {
        Token.Character characterToken = new Token.Character("a");

        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(characterToken);
        assertNotNull(builder);
    }

    @Test
    public void insertDoctypeTest() {
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("test");

        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.insert(doctypeToken);
        assertNotNull(builder);
    }

    @Test
    public void parseFragmentTest() {
        String fragment = "<div><p>Test</p></div>";
        String baseUri = "http://example.com/";
        Parser parser = Parser.xmlParser();

        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment(fragment, baseUri, parser);

        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

    @Test
    public void parseFragmentWithContextTest() {
        String fragment = "<p>Test</p>";
        Element context = new Element("div");
        String baseUri = "http://example.com/";
        Parser parser = Parser.xmlParser();

        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment(fragment, context, baseUri, parser);

        assertNotNull(nodes);
        assertFalse(nodes.isEmpty());
    }

}