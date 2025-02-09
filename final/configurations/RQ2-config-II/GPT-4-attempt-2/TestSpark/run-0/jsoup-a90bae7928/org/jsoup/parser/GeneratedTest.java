package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        ParseSettings settings = xmlTreeBuilder.defaultSettings();
        assertEquals(false, settings.preserveTagCase());
    }

    @Test
    public void initialiseParseTest() {
        Parser parser = new Parser(new XmlTreeBuilder());
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String baseUri = "http://example.com/";
        xmlTreeBuilder.initialiseParse(new StringReader("<html><body>test</body></html>"), baseUri, parser);
        assertEquals(Document.class, xmlTreeBuilder.doc.getClass());
        assertEquals(baseUri, xmlTreeBuilder.doc.baseUri());
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse(new StringReader("<html><body>test</body></html>"), "http://example.com/");
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse("<html><body>test</body></html>", "http://example.com/");
        assertEquals("http://example.com/", doc.baseUri());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.newInstance() instanceof XmlTreeBuilder);
    }

    @Test
    public void processTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.StartTag();
        token.tag("div");
        xmlTreeBuilder.process(token);
        assertEquals("div", xmlTreeBuilder.getStack().getFirst().nodeName());
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Node node = new Element("div");
        xmlTreeBuilder.insertNode(node);
        assertEquals("div", xmlTreeBuilder.getStack().getFirst().nodeName());
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tag("div");
        xmlTreeBuilder.insert(startTag);
        assertEquals("div", xmlTreeBuilder.getStack().getFirst().nodeName());
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment();
        commentToken.setData("test comment");
        xmlTreeBuilder.insert(commentToken);
        assertEquals("test comment", ((Comment) xmlTreeBuilder.doc.childNode(0)).getData());
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Character token = new Token.Character();
        token.setData("test data");
        xmlTreeBuilder.insert(token);
        assertEquals("test data", ((TextNode) xmlTreeBuilder.doc.childNode(0)).getWholeText());
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.Doctype d = new Token.Doctype();
        d.init("html", "", "", false);
        xmlTreeBuilder.insert(d);
        assertEquals("html", ((DocumentType) xmlTreeBuilder.doc.childNode(0)).attr("name"));
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag();
        startTag.tag("div");
        xmlTreeBuilder.insert(startTag);
        Token.EndTag endTag = new Token.EndTag();
        endTag.tag("div");
        xmlTreeBuilder.popStackToClose(endTag);
        assertEquals(0, xmlTreeBuilder.getStack().size());
    }

    @Test
    public void parseFragmentTest() {
        Parser parser = new Parser(new XmlTreeBuilder());
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<div>test</div>", "http://example.com/", parser);
        assertEquals(1, nodes.size());
        assertEquals("http://example.com/", nodes.get(0).baseUri());
    }

}