package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.Reader;
import java.io.StringReader;

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
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Token;

public class GeneratedTest {

    @Test
    public void initialiseParseReaderInputBaseUriParser() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com";
        Parser parser = null;
        builder.initialiseParse(input, baseUri, parser);
    }

    @Test
    public void initialiseParseStringInputBaseUriParser() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com";
        Parser parser = null;
        builder.initialiseParse(input, baseUri, parser);
    }

    @Test
    public void parseStringInputBaseUri() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com";
        Document document = builder.parse(input, baseUri);
        assertNotNull(document);
        assertEquals("http://example.com", document.baseUri());
    }

    @Test
    public void parseStringInputBaseUriInvalid() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child/></root>");
        String invalidBaseUri = "http://example.com:8080";
        Document document = builder.parse(input, invalidBaseUri);
        assertNull(document);
    }

    @Test
    public void newInstance() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = builder.newInstance();
        assertNotNull(newInstance);
    }

    @Test
    public void processTokenStartTag() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = Token.StartTag;
        assertTrue(builder.process(token));
    }

    @Test
    public void processTokenEndTag() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = Token.EndTag;
        assertTrue(builder.process(token));
    }

    @Test
    public void insertNodeNode() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Node node = new CDataNode("data");
        builder.insertNode(node);
        assertNotNull(node);
    }

    @Test
    public void insertTokenCharacter() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = Token.Character;
        String character = "!";
        builder.insert(token, character);
        assertEquals(character, builder.popStackToClose(token));
    }

    @Test
    public void insertCommentCommentToken() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token commentToken = Token.Comment;
        Comment comment = new Comment("<!-- comment -->");
        builder.insert(commentToken, comment);
        assertNotNull(comment);
    }

    @Test
    public void parseFragmentStringBaseUriParser() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child/></root>");
        String baseUri = "http://example.com";
        Parser parser = null;
        List<Node> nodes = builder.parseFragment(input, baseUri, parser);
        assertNotNull(nodes);
    }

    @Test
    public void parseFragmentStringBaseUriParserInvalid() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child/></root>");
        String invalidBaseUri = "http://example.com:8080";
        Parser parser = null;
        List<Node> nodes = builder.parseFragment(input, invalidBaseUri, parser);
        assertNull(nodes);
    }

    @Test
    public void parseFragmentElementContextStringParser() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Reader input = new StringReader("<root><child/></root>");
        Element context = new Element("context");
        String baseUri = "http://example.com";
        Parser parser = null;
        List<Node> nodes = builder.parseFragment(input, context, baseUri, parser);
        assertNotNull(nodes);
    }

}