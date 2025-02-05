package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        List<Node> nodes = new XmlTreeBuilder().parseFragment("<tag>content</tag>", "http://baseUri.com", Parser.xmlParser());
        assertEquals(1, nodes.size());
    }

}