package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<root><child></child></root>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "baseUri", new Parser(xmlTreeBuilder));

        assertEquals(1, nodes.size());
        assertEquals("root", nodes.get(0).nodeName());
    }

}