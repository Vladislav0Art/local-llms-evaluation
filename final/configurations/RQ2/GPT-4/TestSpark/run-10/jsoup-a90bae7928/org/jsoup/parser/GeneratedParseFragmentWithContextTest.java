package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("root"), "http://base.uri");
        List<Node> nodes = builder.parseFragment("<child/>", context, "http://base.uri", new Parser(builder));
        assertNotNull(nodes);
        assertTrue(nodes.get(0) instanceof Element);
        assertEquals("child", nodes.get(0).nodeName());
        assertEquals("root", ((Element) nodes.get(0)).parent().nodeName());
    }

}