package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

public class GeneratedTestParseFragmentWithoutContext {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void testParseFragmentWithoutContext() {
        String inputFragment = "<body>";
        List<Node> list = xmlTreeBuilder.parseFragment(inputFragment, "http://example.com/baseuri", null);
        assertEquals(1, list.size());
    }

}