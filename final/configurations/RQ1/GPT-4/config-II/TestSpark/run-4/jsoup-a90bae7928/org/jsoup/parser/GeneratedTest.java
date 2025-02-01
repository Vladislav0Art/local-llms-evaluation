package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertEquals(ParseSettings.preserveCase, xmlTreeBuilder.defaultSettings());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<root></root>");
        xmlTreeBuilder.initialiseParse(input, "baseUri", new Parser(xmlTreeBuilder));

        assertTrue(xmlTreeBuilder.stack.contains(xmlTreeBuilder.doc));
        assertEquals(Document.OutputSettings.Syntax.xml, xmlTreeBuilder.doc.outputSettings().syntax());
        assertEquals(Entities.EscapeMode.xhtml, xmlTreeBuilder.doc.outputSettings().escapeMode());
        assertFalse(xmlTreeBuilder.doc.outputSettings().prettyPrint());
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader input = new StringReader("<root></root>");
        Document doc = xmlTreeBuilder.parse(input, "baseUri");

        assertNotNull(doc);
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse("<root></root>", "baseUri");

        assertNotNull(doc);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();

        assertNotNull(newInstance);
        assertNotEquals(xmlTreeBuilder, newInstance);
    }

    @Test
    public void processValidTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token validToken = new Token.StartTag();
        validToken.tag(Tag.valueOf("root"));

        assertSame(true, xmlTreeBuilder.process(validToken));
    }

    @Test
    public void processInvalidTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token invalidToken = new Token.EOF();

        xmlTreeBuilder.process(invalidToken);
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<root><child></child></root>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "baseUri", new Parser(xmlTreeBuilder));

        assertEquals(1, nodes.size());
        assertEquals("root", nodes.get(0).nodeName());
    }

}