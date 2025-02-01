package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentElementTest {

    @Test
    public void parseFragmentElementTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element element = new Element("p", "http://test.com");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<a></a>", element, "http://test.com", new Parser(xmlTreeBuilder));
        assertTrue(nodes.get(0) instanceof Element);
    }

}