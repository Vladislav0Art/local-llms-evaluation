package org.jsoup.parser;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.XmlTreeBuilder;
import org.jsoup.helper.Validate;

public class GeneratedTestParseFragmentWithContext {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    @Test
    public void testParseFragmentWithContext() {
        Element root = new Element("div");
        Document document = xmlTreeBuilder.newInstance();
        xmlTreeBuilder.insert(root);
        xmlTreeBuilder.insert(new TokenComment("<!-- comment -->"));
        String inputFragment = "<body>";
        List<Node> list = xmlTreeBuilder.parseFragment(inputFragment, "http://example.com/baseuri", document);
        assertEquals(1, list.size());
    }

}