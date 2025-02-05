package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void initialiseParseTest() {
        Reader reader = new StringReader("<tag>content</tag>");
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(reader, "http://baseUri.com", Parser.xmlParser());
        assertNotNull(builder.getBaseUri());
    }

    @Test
    public void parseReaderTest() {
        Reader reader = new StringReader("<tag>content</tag>");
        Document doc = new XmlTreeBuilder().parse(reader, "http://baseUri.com");
        assertNotNull(doc);
    }

    @Test
    public void parseStringTest() {
        Document doc = new XmlTreeBuilder().parse("<tag>content</tag>", "http://baseUri.com");
        assertNotNull(doc);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder instance = new XmlTreeBuilder().newInstance();
        assertNotNull(instance);
    }

    @Test
    public void processTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token.StartTag("tag");
        assertTrue(builder.process(token));
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder parser = new XmlTreeBuilder();
        parser.insertNode(new ANode("Empty node"));
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder parser = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("test");
        assertNotNull(parser.insert(startTag));
    }

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder parser = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.data("test comment");
        parser.insert(commentToken);
    }

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder parser = new XmlTreeBuilder();
        Token.Character characterToken = new Token.Character();
        characterToken.data("a");
        parser.insert(characterToken);
    }

    @Test
    public void insertDoctypeTokenTest() {
        XmlTreeBuilder parser = new XmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.name("html");
        parser.insert(doctypeToken);
    }

    @Test
    public void popStackToCloseEndTagTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag();
        endTag.name("test");
        builder.popStackToClose(endTag);
    }

    @Test
    public void parseFragmentTest() {
        List<Node> nodes = new XmlTreeBuilder().parseFragment("<tag>content</tag>", "http://baseUri.com", Parser.xmlParser());
        assertEquals(1, nodes.size());
    }

}