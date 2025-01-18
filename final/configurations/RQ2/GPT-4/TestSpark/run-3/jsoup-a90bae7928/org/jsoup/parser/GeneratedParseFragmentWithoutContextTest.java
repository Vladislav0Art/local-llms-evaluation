package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.Parser;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentWithoutContextTest {

    @Test
    public void parseFragmentWithoutContextTest() {
        Parser parser = Parser.xmlParser();
        XmlTreeBuilder xmlTreeBuilder = (XmlTreeBuilder) parser.treeBuilder();
        String inputFragment = "<tag>content</tag>";
        List<Node> nodes = xmlTreeBuilder.parseFragment(inputFragment, "", parser);
        Assert.assertEquals("<tag>\n content\n</tag>", nodes.get(0).toString());
    }

}