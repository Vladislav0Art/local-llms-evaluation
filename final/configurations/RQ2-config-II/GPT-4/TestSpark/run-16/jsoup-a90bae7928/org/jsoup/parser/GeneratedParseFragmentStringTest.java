package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.parser.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedParseFragmentStringTest {

    @Test
    public void parseFragmentStringTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        List<Node> nodes = builder.parseFragment("<tag>text</tag>", "http://example.com", new Parser(builder));
        assertNotNull(nodes);
    }

}