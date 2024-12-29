package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void initialiseParseTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new StringReader("<tag></tag>"), "http://base.uri", new Parser(new XmlTreeBuilder()));
        // Further assertions can be made if the method 'initialiseParse' has visible side effects
    }

    @Test
    public void parseReaderInputTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse(new StringReader("<tag></tag>"), "http://base.uri");
        // check if the root element was correctly processed
        assertNotNull(doc.selectFirst("tag"));
    }

    @Test
    public void parseStringInputTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document doc = builder.parse("<tag></tag>", "http://base.uri");
        // check if the root element was correctly processed
        assertNotNull(doc.selectFirst("tag"));
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        XmlTreeBuilder copy = builder.newInstance();
        // check if the new instance is not null
        assertNotNull(copy);
    }

    @Test
    public void parseFragmentNoContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<tag></tag>", "http://base.uri", new Parser(new XmlTreeBuilder()));
        // check if the parsed fragment has the correct root element
        assertEquals("<tag></tag>", nodes.get(0).outerHtml());
    }

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<tag></tag>", null, "http://base.uri", new Parser(new XmlTreeBuilder()));
        // check if the parsed fragment has the correct root element
        assertEquals("<tag></tag>", nodes.get(0).outerHtml());
    }

}