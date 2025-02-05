package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<html><body></body></html>", "baseUri", new Parser(xmlTreeBuilder));
        assertFalse(nodes.isEmpty());
        assertEquals("html", nodes.get(0).nodeName());
    }

}