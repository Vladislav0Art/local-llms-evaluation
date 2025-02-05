package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseFragmentInputContextBaseUriParserTest {

    @Test
    public void parseFragmentInputContextBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Node node = new TextNode("context");
        assertNotNull(xmlTreeBuilder.parseFragment("<hello>world</hello>", node, "http://base.uri", new Parser(xmlTreeBuilder)));
    }

}