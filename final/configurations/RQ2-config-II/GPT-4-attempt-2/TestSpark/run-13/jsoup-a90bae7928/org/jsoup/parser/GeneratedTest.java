package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Test
    public void initialiseParseTest() {
        Parser parser = new Parser(new XmlTreeBuilder());
        XmlTreeBuilder treeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        treeBuilder.initialiseParse(new StringReader("<xml></xml>"), "http://google.com", parser);
        assertEquals("http://google.com", treeBuilder.getBaseUri());
    }

    @Test
    public void parseReaderTest() {
        Document document = new XmlTreeBuilder().parse(new StringReader("<xml></xml>"), "http://google.com");
        assertEquals("<xml></xml>", document.html());
    }

    @Test
    public void parseStringTest() {
        Document document = new XmlTreeBuilder().parse("<xml></xml>", "http://google.com");
        assertEquals("<xml></xml>", document.html());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder original = new XmlTreeBuilder();
        XmlTreeBuilder copy = original.newInstance();
        assertTrue(copy instanceof XmlTreeBuilder);
    }

    @Test
    public void processTokenTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token token = new Token.Character().data("test");
        assertTrue(treeBuilder.process(token));
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xmlTreeBuilderSpy = spy(new XmlTreeBuilder());
        Node node = new TextNode("text");
        xmlTreeBuilderSpy.insertNode(node);
        verify(xmlTreeBuilderSpy, times(1)).insertNode(node);
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag().name("p");
        assertEquals("p", treeBuilder.insert(startTag).nodeName());
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Comment commentToken = new Token.Comment().data("This is a comment");
        treeBuilder.insert(commentToken);
        assertTrue(treeBuilder.getDocument().childNode(0) instanceof Comment);
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Character token = new Token.Character().data("test");
        treeBuilder.insert(token);
        assertTrue(treeBuilder.getDocument().childNode(0) instanceof TextNode);
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.Doctype doctypeToken = new Token.Doctype();
        doctypeToken.attr("name", "html");
        treeBuilder.insert(doctypeToken);
        assertTrue(treeBuilder.getDocument().childNode(0) instanceof DocumentType);
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token.StartTag startTag = new Token.StartTag().name("p");
        treeBuilder.insert(startTag);
        Token.EndTag endTag = new Token.EndTag().name("p");
        treeBuilder.popStackToClose(endTag);
        assertTrue(treeBuilder.getStack().isEmpty());
    }

    @Test
    public void parseFragmentTest() {
        List<Node> nodes = new XmlTreeBuilder().parseFragment("<p>Hello</p>", "http://google.com", Parser.xmlParser());
        assertEquals("p", nodes.get(0).nodeName());
        assertEquals("Hello", nodes.get(0).childNode(0).outerHtml());
    }

}