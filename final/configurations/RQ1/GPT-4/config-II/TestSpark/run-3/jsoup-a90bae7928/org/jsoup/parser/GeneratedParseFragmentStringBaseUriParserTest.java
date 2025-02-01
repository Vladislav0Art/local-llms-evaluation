package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseFragmentStringBaseUriParserTest {

    @Test
    public void parseFragmentStringBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<root><child/></root>", "http://example.com", new Parser(xmlTreeBuilder));
        assertEquals(1, nodes.size()); // root node
        assertEquals("root", nodes.get(0).nodeName());
    }

}