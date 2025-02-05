package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        // Scenario: Verify the default settings
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        ParseSettings parseSettings = xmlTreeBuilder.defaultSettings();
        Assert.assertNotNull(parseSettings);
    }

    @Test
    public void initialiseParseTest() {
        // Scenario: Initialization of parser
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root></root>");
        xmlTreeBuilder.initialiseParse(reader, "baseUri", Parser.xmlParser());
        Assert.assertNotNull(xmlTreeBuilder.stack);
    }

    @Test
    public void parseReaderTest() {
        // Scenario: Parsing from a Reader
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root></root>");
        Document document = xmlTreeBuilder.parse(reader, "baseUri");
        Assert.assertNotNull(document);
    }

    @Test
    public void parseStringTest() {
        // Scenario: Parsing from a plain String
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<root></root>", "baseUri");
        Assert.assertNotNull(document);
    }

    @Test
    public void newInstanceTest() {
        // Scenario: Creating a new instance of XmlTreeBuilder
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newXmlTreeBuilder = xmlTreeBuilder.newInstance();
        Assert.assertNotNull(newXmlTreeBuilder);
    }

    @Test
    public void processTokenTest() {
        // Scenario: Processing a token
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Token token = new Token.Character();
        token.setValue("Some value");
        boolean result = xmlTreeBuilder.process(token);
        Assert.assertTrue(result);
    }

    @Test
    public void insertNodeTest() {
        // Scenario: Insert a Node into XmlTreeBuilder
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insertNode(new Element("root"));
        Assert.assertEquals(1, xmlTreeBuilder.stack.size());
    }

    @Test
    public void insertStartTagTest() {
        // Scenario: Insert Token.StartTag into the XmlTreeBuilder
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element currentElement = xmlTreeBuilder.insert(new Token.StartTag().name("tag"));
        Assert.assertNotNull(currentElement);
    }

    @Test
    public void insertCommentTest() {
        // Scenario: Insert Token.Comment into the XmlTreeBuilder
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.insert(new Token.Comment().getData("Some Comment"));
        List<Node> result = xmlTreeBuilder.stack;
        Assert.assertEquals(1, result.size());
        Assert.assertTrue(result.get(0) instanceof Comment);
    }

    @Test
    public void parseFragmentTest() {
        // Scenario: Parsing a fragment
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<root>content</root>", "baseUri", Parser.xmlParser());
        Assert.assertEquals(1, nodes.size());
    }

}