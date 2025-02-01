package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodes = xmlTreeBuilder.parseFragment("<product>Apple</product>", "http://sample.com", new Parser(xmlTreeBuilder));
        assertFalse(nodes.isEmpty());
    }

}