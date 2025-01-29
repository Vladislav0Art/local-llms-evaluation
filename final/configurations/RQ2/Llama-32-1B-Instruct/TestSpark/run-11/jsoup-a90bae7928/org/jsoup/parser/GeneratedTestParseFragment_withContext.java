package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestParseFragment_withContext {

    @Test
    public void testParseFragment_withContext() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parseDocument("<root><child></child></root>", "http://example.com", null);
        List<Node> nodes = builder.parseFragment(new StringReader("foo bar baz"), null, null);
        assertEquals(3, nodes.size());
    }

}