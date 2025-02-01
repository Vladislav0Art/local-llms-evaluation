package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseFragmentInputFragmentBaseUriParserTest {

    @Test
    public void parseFragmentInputFragmentBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        List<Node> nodeList = xmlTreeBuilder.parseFragment("<tag>content</tag>", "http://base.uri", Parser.xmlParser());

        Assert.assertNotNull(nodeList);
        Assert.assertEquals(1, nodeList.size());
        Assert.assertTrue(nodeList.get(0) instanceof Element);
        Assert.assertEquals("<tag>content</tag>", nodeList.get(0).outerHtml());
    }

}