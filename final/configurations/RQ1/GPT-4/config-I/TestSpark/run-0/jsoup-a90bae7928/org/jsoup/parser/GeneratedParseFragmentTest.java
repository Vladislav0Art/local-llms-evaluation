package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.parser.Token;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<fragment><element /></fragment>";
        String baseUri = "http://example.com/";

        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, baseUri, Parser.xmlParser());

        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("fragment", nodes.get(0).nodeName());
    }

}