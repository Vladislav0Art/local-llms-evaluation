package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<element>Content</element>", "http://example.com", Parser.xmlParser());
        assertNotNull(nodes);
        assertEquals("element", nodes.get(0).nodeName());
        assertEquals("Content", nodes.get(0).childNode(0).toString());
    }

}