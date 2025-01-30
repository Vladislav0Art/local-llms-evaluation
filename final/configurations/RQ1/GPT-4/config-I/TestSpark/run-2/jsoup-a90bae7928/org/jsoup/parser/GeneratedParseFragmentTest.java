package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) parser.getTreeBuilder();
        Element context = new Element(Tag.valueOf("context"), "");
        List<Node> nodes = xmlTreeBuilder.parseFragment("<sample>example</sample>", context, "http://sample.com", parser);
        assertEquals(1, nodes.size());
        assertTrue(nodes.get(0) instanceof Element);
    }

}