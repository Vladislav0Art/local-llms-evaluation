package org.jsoup.parser;

import static org.junit.Assert.*;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Test;

import java.util.List;
import java.io.StringReader;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Element context = new Element(Tag.valueOf("body"), "");

        List<Node> nodes = builder.parseFragment("<p>test</p>", context, "http://base.uri", Parser.xmlParser());
        Element p = (Element) nodes.get(0);
        assertEquals("test", p.text());
    }

}