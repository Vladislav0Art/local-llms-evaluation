package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.util.List;
import java.io.StringReader;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();

        List<Node> nodes = builder.parseFragment("<node>test</node>", "http://base.uri", Parser.xmlParser());
        Element node = (Element) nodes.get(0);
        assertEquals("test", node.text());
    }

}