package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.Reader;
import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String inputFragment = "<tag>Test Fragment</tag>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "http://testUri", new Parser(xmlTreeBuilder));
        assertNotNull(nodes);
        assertEquals(1, nodes.size());
    }

}