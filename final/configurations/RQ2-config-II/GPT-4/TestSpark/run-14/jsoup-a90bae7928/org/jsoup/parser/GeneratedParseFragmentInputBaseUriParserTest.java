package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Test;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseFragmentInputBaseUriParserTest {

    @Test
    public void parseFragmentInputBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        assertNotNull(xmlTreeBuilder.parseFragment("<hello>world</hello>", "http://base.uri", new Parser(xmlTreeBuilder)));
    }

}