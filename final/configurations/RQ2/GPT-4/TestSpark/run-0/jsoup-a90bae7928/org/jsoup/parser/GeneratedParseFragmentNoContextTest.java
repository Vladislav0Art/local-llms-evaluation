package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedParseFragmentNoContextTest {

    @Test
    public void parseFragmentNoContextTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<tag></tag>", "http://base.uri", new Parser(new XmlTreeBuilder()));
        // check if the parsed fragment has the correct root element
        assertEquals("<tag></tag>", nodes.get(0).outerHtml());
    }

}