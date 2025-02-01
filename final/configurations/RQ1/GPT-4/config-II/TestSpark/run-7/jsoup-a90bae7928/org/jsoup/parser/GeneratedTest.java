package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new StringReader("<tag>content</tag>"), "http://example.com", Mockito.mock(Parser.class));

        Document doc = builder.doc;
        assertEquals(Document.OutputSettings.Syntax.xml, doc.outputSettings().syntax());
        assertEquals(Entities.EscapeMode.xhtml, doc.outputSettings().escapeMode());
        assertFalse(doc.outputSettings().prettyPrint());
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(new StringReader("<tag>content</tag>"), "http://example.com");

        assertEquals("content", document.text());
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse("<tag>content</tag>", "http://example.com");

        assertEquals("content", document.text());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        XmlTreeBuilder instance = builder.newInstance();

        assertTrue(instance instanceof XmlTreeBuilder);
    }

    @Test
    public void processTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = new Token.StartTag();

        assertTrue(builder.process(token));
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Node node = new TextNode("content");
        builder.currentElement().appendChild(node);

        assertEquals("content", builder.currentElement().text());
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token.EndTag endTag = new Token.EndTag("tag");

        builder.stack.add(new Element("tag"));
        builder.popStackToClose(endTag);

        assertTrue(builder.stack.isEmpty());
    }

    @Test
    public void processInvalidTokenTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Token token = Mockito.mock(Token.class);
        Mockito.when(token.type).thenReturn(null);

        builder.process(token);
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<tag>content</tag>", "http://example.com", Mockito.mock(Parser.class));

        assertFalse(nodes.isEmpty());
        assertEquals("content", nodes.get(0).childNode(0).outerHtml());
    }

}