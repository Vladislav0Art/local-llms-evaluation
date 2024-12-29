package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseFragmentInputFragmentBaseUriParserTest {

    @Test
    public void parseFragmentInputFragmentBaseUriParserTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        String inputFragment = "<h1>Hello</h1>";
        Parser parser = Parser.xmlParser();
        List<Node> nodes = builder.parseFragment(inputFragment, "http://base.uri", parser);
        assertEquals(1, nodes.size());
        Node node = nodes.get(0);
        assertTrue(node instanceof Element);
        assertEquals("h1", ((Element) node).tagName());
        assertEquals("Hello", ((Element) node).text());
    }

}