package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root>Test</root>"), "http://test.com", new Parser(xmlTreeBuilder));

        Document.OutputSettings outputSettings = xmlTreeBuilder.doc.outputSettings();
        assertEquals(Document.OutputSettings.Syntax.xml, outputSettings.syntax());
        assertEquals(Entities.EscapeMode.xhtml, outputSettings.escapeMode());
        assertEquals(false, outputSettings.prettyPrint());
    }

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        Document document = xmlTreeBuilder.parse(new StringReader("<root>Test</root>"), "http://test.com");

        assertEquals("Test", document.text());
    }

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        Document document = xmlTreeBuilder.parse("<root>Test</root>", "http://test.com");

        assertEquals("Test", document.text());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();

        assertEquals(XmlTreeBuilder.class, newInstance.getClass());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        List<Node> nodes = xmlTreeBuilder.parseFragment("<root>Test</root>", "http://test.com", new Parser(xmlTreeBuilder));

        assertEquals(1, nodes.size());
        assertEquals("Test", nodes.get(0).childNode(0).toString());
    }

    @Test
    public void processUnexpectedTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.ResetToken();
        xmlTreeBuilder.process(token);
    }

}