package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedParseFragmentStringElementBaseUriParserTest {

    @Test
    public void parseFragmentStringElementBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("root"), "");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<child/>", context, "http://example.com", new Parser(xmlTreeBuilder));
        assertEquals(1, nodes.size()); // root node
        assertEquals("root", nodes.get(0).nodeName());
    }

}