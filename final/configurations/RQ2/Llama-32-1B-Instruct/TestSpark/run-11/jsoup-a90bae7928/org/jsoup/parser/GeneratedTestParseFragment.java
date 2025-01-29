package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.List;

public class GeneratedTestParseFragment {

    @Test
    public void testParseFragment() throws IOException {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parseDocument("<root><child></child></root>");
        List<Node> nodes = builder.parseFragment(new StringReader("foo bar baz"), null, null);
        assertEquals(3, nodes.size());
    }

}