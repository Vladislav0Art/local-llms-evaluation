package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentWithContextTest {

    @Test
    public void parseFragmentWithContextTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) parser.treeBuilder();
        Element context = new Element("context");
        String inputFragment = "<tag>content</tag>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, context, "", parser);
        Assert.assertEquals("<tag>\n content\n</tag>", nodes.get(0).toString());
    }

}