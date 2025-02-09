package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentTest {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    // Test initialiseParse method

    @Test
    public void parseFragmentTest() {
        String inputFragment = "<fragment></fragment>";
        String baseUri = "http://base.uri";
        Parser parser = new Parser(xmlTreeBuilder);

        List<Node> nodeList = xmlTreeBuilder.parseFragment(inputFragment, baseUri, parser);
        Assert.assertFalse(nodeList.isEmpty());
    }

}