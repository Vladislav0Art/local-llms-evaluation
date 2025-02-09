package org.jsoup.parser;

import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        assertNotNull(xb.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        Parser mockParser = Mockito.mock(Parser.class);
        xb.initialiseParse(new StringReader("<test></test>"), "baseUri", mockParser);
        verify(mockParser).initialiseParse(new StringReader("<test></test>"), "baseUri", xb);
    }

    @Test
    public void parseTest_ReaderParam() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        Document doc = xb.parse(new StringReader("<test></test>"), "baseUri");
        assertNotNull(doc);
        assertEquals("test", doc.child(0).nodeName());
    }

    @Test
    public void parseTest_StringParam() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        Document doc = xb.parse("<test></test>", "baseUri");
        assertNotNull(doc);
        assertEquals("test", doc.child(0).nodeName());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        assertNotNull(xb.newInstance());
    }

    @Test
    public void processTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        Token.TokenListener mockListener = Mockito.mock(Token.TokenListener.class);
        xb.registerListener(mockListener);
        xb.process(new Token.EndTag());
        verify(mockListener).inform(new Token.EndTag());
    }

    @Test
    public void insertNodeTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        xb.insertNode(new TextNode("Test"));
        assertEquals("Test", xb.getCurrent().child(0).toString());
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        xb.insert(new Token.StartTag("test"));
        xb.popStackToClose(new Token.EndTag("test"));
        assertTrue(xb.getStack().isEmpty());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        Parser mockParser = Mockito.mock(Parser.class);
        List<Node> nodes = xb.parseFragment("<test></test>", "http://baseUri", mockParser);
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("test", ((Element) nodes.get(0)).nodeName());
    }

}