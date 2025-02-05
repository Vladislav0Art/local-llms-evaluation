package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        assertNotNull(builder.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader stringReader = new StringReader("<xml></xml>");
        builder.initialiseParse(stringReader, "http://example.com", Parser.xmlParser());
        assertEquals("http://example.com", builder.doc().baseUri());
    }

    @Test
    public void parseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        StringReader stringReader = new StringReader("<xml></xml>");
        Document doc = builder.parse(stringReader, "http://example.com");
        assertEquals("<xml></xml>", doc.wholeText().trim());
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element node = new Element(Tag.valueOf("tag"), "", new Attributes());
        builder.insertNode(node);
        assertEquals("tag", builder.stack.first().nodeName());
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.EndTag endTagToken = new Token.EndTag();
        endTagToken.tagName("body");
        builder.popStackToClose(endTagToken);
        assertFalse(builder.stack.contains(endTagToken));
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = new ArrayList<>();
        nodes = builder.parseFragment("<xml><tag/></xml>", "http://example.com", Parser.xmlParser());
        assertEquals(1, nodes.size());
        assertEquals("xml", nodes.get(0).nodeName());
    }

    @Test
    public void processTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag();
        endTag.tagName("tag");
        assertTrue(builder.process(endTag));
    }

    @Test
    public void insertCharacterTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Character character = new Token.Character();
        character.data("data");
        builder.insert(character);
        Node last = builder.stack.last().childNode(0);
        assertTrue(last instanceof TextNode);
        assertEquals("data", ((TextNode) last).getWholeText());
    }

    @Test
    public void insertCommentTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Comment comment = new Token.Comment();
        comment.data("data");
        builder.insert(comment);
        Node last = builder.stack.last().childNode(0);
        assertTrue(last instanceof Comment);
        assertEquals("data", ((Comment) last).getData());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.nameAttr("name", "value");
        builder.insert(startTag);
        Element last = builder.stack.last();
        assertEquals("name", last.tagName());
        assertEquals("value", last.attr("value"));
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.Doctype doctype = new Token.Doctype();
        doctype.init("html", "publicId", "systemId", true);
        builder.insert(doctype);
        Node last = builder.stack.last().childNode(0);
        assertTrue(last instanceof DocumentType);
        DocumentType docType = (DocumentType) last;
        assertEquals("html", docType.name());
        assertEquals("publicId", docType.publicId());
        assertEquals("systemId", docType.systemId());
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("context"), "");
        List<Node> nodes = builder.parseFragment("<tag/>", context, "http://example.com", Parser.xmlParser());
        assertEquals(1, nodes.size());
        assertEquals("tag", nodes.get(0).nodeName());
    }

}