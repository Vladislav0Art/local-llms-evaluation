package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Token.*;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.*;

public class GeneratedParseFragmentWithNoContextTest {

    @Test
    public void ParseFragmentWithNoContextTest() {
        XmlTreeBuilder testObject = new XmlTreeBuilder();
        Parser parser = new Parser(testObject);
        List<Node> nodes = testObject.parseFragment("<fruit>Apple</fruit>", "http://example.com", parser);
        assertEquals("fruit", nodes.get(0).nodeName());
        assertEquals("Apple", ((Element) nodes.get(0)).text());
    }

}