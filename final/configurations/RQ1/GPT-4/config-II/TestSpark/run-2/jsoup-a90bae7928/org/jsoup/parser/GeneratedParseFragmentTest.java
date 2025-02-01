package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

        List<Node> nodes = xmlTreeBuilder.parseFragment("<root>Test</root>", "http://test.com", new Parser(xmlTreeBuilder));

        assertEquals(1, nodes.size());
        assertEquals("Test", nodes.get(0).childNode(0).toString());
    }

}