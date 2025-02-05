package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("context"), "");
        List<Node> nodes = builder.parseFragment("<tag/>", context, "http://example.com", Parser.xmlParser());
        assertEquals(1, nodes.size());
        assertEquals("tag", nodes.get(0).nodeName());
    }

}