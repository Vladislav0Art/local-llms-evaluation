package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Token;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentMultipleTest {

    @Test
    public void parseFragmentMultipleTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element div = new Element("div");
        List<Node> nodeList = xmlTreeBuilder.parseFragment("<fragment></fragment>", div, "", Parser.xmlParser());
        assertFalse(nodeList.isEmpty());
    }

}