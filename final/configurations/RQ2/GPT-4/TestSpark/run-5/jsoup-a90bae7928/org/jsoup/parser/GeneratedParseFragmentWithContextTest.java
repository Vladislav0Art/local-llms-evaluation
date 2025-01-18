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
        Parser parser = Parser.xmlParser();
        Element context = new Element("context");
        List<Node> nodes = builder.parseFragment("<test></test>", context, "http://test.com", parser);
        assertFalse(nodes.isEmpty());
        assertEquals(nodes.get(0).nodeName(), "test");
    }

}