package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertNotNull(xmlTreeBuilder.defaultSettings());
    }

    @Test
    public void parseReaderInputAndBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse(new StringReader("<book>Java</book>"), "http://sample.com");
        assertTrue(doc instanceof Document);
    }

    @Test
    public void parseStringInputAndBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document doc = xmlTreeBuilder.parse("<author>John Doe</author>", "http://sample.com");
        assertTrue(doc instanceof Document);
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newInstance = xmlTreeBuilder.newInstance();
        assertTrue(newInstance instanceof XmlTreeBuilder);
    }

    @Test
    public void processInvalidTokenTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.process(new Token.EOF());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<product>Apple</product>", "http://sample.com", new Parser(xmlTreeBuilder));
        assertFalse(nodes.isEmpty());
    }

}