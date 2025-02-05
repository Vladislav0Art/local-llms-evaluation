package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        String inputFragment = "<div></div>";
        List<Node> nodes = treeBuilder.parseFragment(inputFragment, "http://example.com", new Parser(treeBuilder));
        assertEquals(1, nodes.size());
    }

}