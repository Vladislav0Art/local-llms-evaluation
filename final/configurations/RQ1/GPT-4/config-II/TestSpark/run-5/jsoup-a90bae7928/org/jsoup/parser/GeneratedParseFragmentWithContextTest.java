package org.jsoup.parser;

import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element context = new Element("Context", "http://example.com");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<root></root>", context, "http://example.com", new Parser(xmlTreeBuilder));
        assertTrue(nodes.size() > 0);
    }

}