package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<tag>Test Fragment</tag>";
        Element contextElement = new Element(Tag.valueOf("div"), "");
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, contextElement, "http://testUri", new Parser(xmlTreeBuilder));
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
    }

}