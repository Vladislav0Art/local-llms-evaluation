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

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<fragment><element /></fragment>";
        Element context = new Element(Tag.valueOf("context"), "");
        String baseUri = "http://example.com/";

        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, context, baseUri, Parser.xmlParser());

        assertNotNull(nodes);
        assertEquals(1, nodes.size());
        assertEquals("fragment", nodes.get(0).nodeName());
    }

}