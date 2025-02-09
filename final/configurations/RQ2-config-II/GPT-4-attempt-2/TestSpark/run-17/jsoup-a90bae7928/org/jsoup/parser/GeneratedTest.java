package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void parseReaderStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("<root></root>"), "");
        assertNotNull(document);
    }

    @Test
    public void parseStringStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<root></root>", "");
        assertNotNull(document);
    }

    @Test
    public void processTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        boolean result = xmlTreeBuilder.process(new Token.StartTag());
        assertTrue(result);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstanceXmlTreeBuilder = xmlTreeBuilder.newInstance();
        assertNotNull(newInstanceXmlTreeBuilder);
    }

    @Test
    public void insertStartTagTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element element = xmlTreeBuilder.insert(new Token.StartTag());
        assertNotNull(element);
    }

    @Test
    public void insertCommentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Comment());
        // the method doesn't return a value, so we have to verify it doesn't throw exceptions
    }

    @Test
    public void insertCharacterTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Character());
        // the method doesn't return a value, so we have to verify it doesn't throw exceptions
    }

    @Test
    public void insertDoctypeTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Doctype());
        // the method doesn't return a value, so we have to verify it doesn't throw exceptions
    }

    @Test
    public void popStackToCloseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.popStackToClose(new Token.EndTag());
        // the method doesn't return a value, so we have to verify it doesn't throw exceptions
    }

    @Test
    public void parseFragmentSingleTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodeList = xmlTreeBuilder.parseFragment("<fragment></fragment>", "", Parser.xmlParser());
        assertFalse(nodeList.isEmpty());
    }

    @Test
    public void parseFragmentMultipleTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element div = new Element("div");
        List<Node> nodeList = xmlTreeBuilder.parseFragment("<fragment></fragment>", div, "", Parser.xmlParser());
        assertFalse(nodeList.isEmpty());
    }

}