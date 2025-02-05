package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = new ArrayList<>();
        nodes = builder.parseFragment("<xml><tag/></xml>", "http://example.com", Parser.xmlParser());
        assertEquals(1, nodes.size());
        assertEquals("xml", nodes.get(0).nodeName());
    }

}