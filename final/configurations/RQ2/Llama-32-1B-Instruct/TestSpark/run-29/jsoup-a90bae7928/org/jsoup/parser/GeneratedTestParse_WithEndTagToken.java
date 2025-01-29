package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

public class GeneratedTestParse_WithEndTagToken {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void testParse_WithEndTagToken() {
        xmlTreeBuilder.insert(new TokenEndTag("<\\/body>"));
        String inputFragment = "<html><head></head><body></body>";
        List<Node> list = xmlTreeBuilder.parseFragment(inputFragment, "http://example.com/baseuri", null);
        assertEquals(1, list.size());
    }

}