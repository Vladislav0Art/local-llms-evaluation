package org.jsoup.parser;

import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.jsoup.parser.Tokeniser;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.newInstance() instanceof XmlTreeBuilder);
    }

    @Test
    public void parseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Reader reader = new StringReader("<root></root>");
        assertEquals(Document.OutputSettings.Syntax.xml, xmlTreeBuilder.parse(reader, "www.example.com").outputSettings().syntax());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<testFragment></testFragment>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "www.example.com", Parser.xmlParser());
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("testFragment", ((Element) nodes.get(0)).tag().toString());
    }

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) Parser.xmlParser().getTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "www.example.com", Parser.xmlParser());
        assertEquals(1, xmlTreeBuilder.stack.size());
        assertEquals("www.example.com", xmlTreeBuilder.stack.get(0).baseUri());
    }

    @Test
    public void parseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertTrue(xmlTreeBuilder.parse("<root></root>", "www.example.com") instanceof org.jsoup.nodes.Document);
    }

    @Test
    public void parseFragmentSingleContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List nodeList = xmlTreeBuilder.parseFragment("<root></root>", "www.example.com", Parser.xmlParser());
        assertTrue(nodeList.get(0) instanceof org.jsoup.nodes.Element);
    }

    @Test
    public void parseFragmentDoubleContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List nodeList = xmlTreeBuilder.parseFragment("<root></root>", null, "www.example.com", Parser.xmlParser());
        assertTrue(nodeList.get(0) instanceof org.jsoup.nodes.Element);
    }

    @Test
    public void initialiseParseTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(new StringReader("<root></root>"), "www.example.com", parser);

        assertTrue(xmlTreeBuilder.doc.outputSettings().prettyPrint() == false);
    }

    @Test
    public void parseTest() {
        Parser xmlParser = new Parser(new XmlTreeBuilder());
        assertTrue(Jsoup.parse("<root></root>", "www.example.com", xmlParser) instanceof org.jsoup.nodes.Document);
    }

    @Test
    public void parseFragmentTest() {
        Parser xmlParser = new Parser(new XmlTreeBuilder());
        List nodeList = Jsoup.parse("<root></root>", "www.example.com", xmlParser).childNodes();

        assertTrue(nodeList.get(0) instanceof org.jsoup.nodes.Element);
    }

    @Test
    public void parseTest() {
        Reader input = new StringReader("<test></test>");
        String baseUri = "http://example.com";

        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        assertTrue(xmlTreeBuilder.parse(input, baseUri) instanceof org.jsoup.nodes.Document);
    }

    @Test
    public void parseFragmentSingleContextTest() {
        Parser xmlParser = new Parser(new XmlTreeBuilder());
        List nodeList = Jsoup.parse("<root></root>", "www.example.com", xmlParser).childNodes();

        assertTrue(nodeList.get(0) instanceof org.jsoup.nodes.Element);
    }

}