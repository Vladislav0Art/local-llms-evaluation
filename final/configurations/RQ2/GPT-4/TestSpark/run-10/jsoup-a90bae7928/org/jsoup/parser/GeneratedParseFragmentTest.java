package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<root/>", "http://base.uri", new Parser(builder));
        assertNotNull(nodes);
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("root", nodes.get(0).nodeName());
    }

}